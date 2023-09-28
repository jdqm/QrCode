## 二维码生成工具

### 如何使用


下载 [QrCode.jar](https://github.com/jdqm/QrCode/releases/download/v1.0/QrCode.jar)

在终端执行如下命令

```
java -jar url=https://gihub.com/jdqm qrcodeName=qrcode.png savePath=xxx
```

参数说明：

- url: 二维码的目标链接
- qrcodeName: 二维码图片在文件系统中的文件名
- savePath: 生成的二维码图片在文件系统中保存的路径
- width: 二维码宽度，可选参数，默认400px
- height: 二维码高度，可选参数，默认400px


### 为什么做这个工具

在jenkins打包后，我们希望生成一个二维码，测试人员使用手机浏览器扫描即可直接下载安装包，如下图所示

![jenkins](https://raw.githubusercontent.com/jdqm/QrCode/master/image/jenkins.png)


在构建完成后，通过Shell调用改jar来生成qrcode.png，并存档，使用 “Set build description” 插件来配置，该插件的使用可参考[这篇文章](https://blog.csdn.net/ifjgm003/article/details/102825174)