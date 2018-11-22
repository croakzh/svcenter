package com.croakzh.core.utils;

import com.croakzh.core.Constants;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.Session;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author corakzh
 */
public class ShellUtils {

    /**
     * 执行单条cmd指令
     *
     * @param session {@link Session}连接
     * @param command cmd指令
     * @return 结果串
     * @throws Exception 异常
     */
    public static List<String> execCmd(Session session, String command) throws Exception {
        BufferedReader reader;
        Channel channel;
        ArrayList<String> list = new ArrayList<>();

        channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);
        channel.setInputStream(null);
        ((ChannelExec) channel).setErrStream(System.err);
        channel.connect();
        InputStream inputStream = channel.getInputStream();
        reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(Constants.CHARSET_UTF8)));
        String line;
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        channel.disconnect();
        return list;
    }

    /**
     * 上传文件
     *
     * @param session {@link Session}连接
     * @param local   本地文件地址
     * @param remote  服务器文件地址
     * @throws Exception 异常
     */
    public static void uploadFile(Session session, String local, String remote) throws Exception {
        ChannelSftp channel = null;
        InputStream inputStream = null;

        try {
            channel = (ChannelSftp) session.openChannel("sftp");
            channel.connect(Constants.DEFAULT_TIMEOUT);
            inputStream = new FileInputStream(new File(local));
            channel.setInputStream(inputStream);
            channel.put(inputStream, remote);
        } finally {
            if (channel != null) {
                channel.disconnect();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }

    }

//    /**
//     * 下载文件
//     *
//     * @param session {@link Session}连接
//     * @param downloadFile 需下载的文件路径
//     * @param saveFile 保存的本地文件路径
//     */
//    public void downloadFile(Session session, String downloadFile, String saveFile) {
//        if(StringUtils.isNotEmpty(downloadFile)) {
//
//        }
//    }

}
