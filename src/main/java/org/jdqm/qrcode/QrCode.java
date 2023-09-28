package org.jdqm.qrcode;

/**
 * QrCode mata data
 */
public class QrCode {
    /**
     * Qrcode default width 400px
     */
    private int width = 400;

    /**
     * Qrcode default height 400px
     */
    private int height = 400;
    /**
     * QrCode url
     */
    private String url;

    /**
     * QrCode image file name
     */
    private String qrCodeFileName;

    /**
     * QrCode image save to file path
     */
    private String qrCodeSaveFilePath;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQrCodeFileName() {
        return qrCodeFileName;
    }

    public void setQrCodeFileName(String qrCodeFileName) {
        this.qrCodeFileName = qrCodeFileName;
    }

    public String getQrCodeSaveFilePath() {
        return qrCodeSaveFilePath;
    }

    public void setQrCodeSaveFilePath(String qrCodeSaveFilePath) {
        this.qrCodeSaveFilePath = qrCodeSaveFilePath;
    }
}
