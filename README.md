## 开发过程不难免用上Toast 但是系统的Toast 不足以满足需求 索性自己写了个工具
### 直接上个图片效果吧
![image.png](https://upload-images.jianshu.io/upload_images/13934769-2d1e29064ad4f8ee.png)
![image.png](https://upload-images.jianshu.io/upload_images/13934769-f5592c7c90926249.png)
![image.png](https://upload-images.jianshu.io/upload_images/13934769-6f39d47f01b40113.png)
![image.png](https://upload-images.jianshu.io/upload_images/13934769-ad94548daa7da5f8.png)


## 除了这些还加上了自选图片显示（图片放的有点大 不好看）
![image.png](https://upload-images.jianshu.io/upload_images/13934769-346811bf9bb170df.png)
 ## 使用方法 
 1.根目录的 build.gradle 添加

allprojects {
   	repositories {
   		...
   		maven { url 'https://jitpack.io' }
   	}
   }
2.在app的buil.gradle 添加
implementation 'com.github.YiPHaoYouWei:ToastUitl:1.0'

3.初始化
![image.png](https://upload-images.jianshu.io/upload_images/13934769-06ed1dd527f81a96.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
4.直接调用
![image.png](https://upload-images.jianshu.io/upload_images/13934769-c4efe3e158c37885.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
