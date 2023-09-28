package org.jdqm.qrcode;

import java.io.File;

/**
 * Qrcode creator(二维码生成器)
 *
 * Created by Jdqm on 2023/09/27
 */
public class Main {

    private final static QrCode qrCode = new QrCode();

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("url, qrcodeName and savePath are mandatory!");
            return;
        }

        for (String arg : args) {
            if (arg.startsWith("url=")) {
                qrCode.setUrl(arg.trim().split("=")[1]);
            } else if (arg.startsWith("qrcodeName=")) {
                qrCode.setQrCodeFileName(arg.trim().split("=")[1]);
            } else if (arg.startsWith("savePath=")) {
                qrCode.setQrCodeSaveFilePath(arg.trim().split("=")[1]);
            } else if (arg.startsWith("width=")) {
                qrCode.setWidth(Integer.parseInt(arg.trim().split("=")[1]));
            } else if (arg.startsWith("height=")) {
                qrCode.setHeight(Integer.parseInt(arg.trim().split("=")[1]));
            }
        }

        System.out.println(qrCode);

        QRCodeUtil.createCodeToFile(qrCode.getUrl(), new File(qrCode.getQrCodeFileName()), qrCode.getQrCodeSaveFilePath(), qrCode.getWidth(), qrCode.getHeight());
    }
}