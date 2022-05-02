## Swagger-UI
    Swagger-UI是HTML, Javascript, CSS的一个集合，可以动态地根据注解生成在线API文档。
### 常用注解
* @Api：用于修饰Controller类，生成Controller相关文档信息
* @ApiOperation：用于修饰Controller类中的方法，生成接口方法相关文档信息
* @ApiParam：用于修饰接口中的参数，生成接口参数相关文档信息
* @ApiModelProperty：用于修饰实体类的属性，当实体类是请求参数或返回结果时，直接生成相关文档信息
## 添加Swagger-UI的配置
* 生成指定包下面的类的API文档
* 生成有指定注解的类的API文档
* 生成有指定注解的方法的API文档


## Spring Security
    SpringSecurity是一个强大的可高度定制的认证和授权框架，对于Spring应用来说它是一套Web安全标准。SpringSecurity注重于为Java应用提供认证和授权功能，像所有的Spring项目一样，它对自定义需求具有强大的扩展性。
## JWT
    JWT是JSON WEB TOKEN的缩写，它是基于 RFC 7519 标准定义的一种可以安全传输的的JSON对象，由于使用了数字签名，所以是可信任和安全的。
### JWT的组成
* JWT token的格式：header.payload.signature
* header中用于存放签名的生成算法
``
{"alg": "HS512"}
``
* payload中用于存放用户名、token的生成时间和过期时间
```
{"sub":"admin","created":1489079981393,"exp":1489684781}
```
* signature为以header和payload生成的签名，一旦header和payload被篡改，验证将失败
``
//secret为加密算法的密钥
String signature = HMACSHA512(base64UrlEncode(header) + "." +base64UrlEncode(payload),secret)
``

JWT实现认证和授权的原理
* 用户调用登录接口，登录成功后获取到JWT的token；
* 之后用户每次调用接口都在http的header中添加一个叫Authorization的头，值为JWT的token；
* 后台程序通过对Authorization头中信息的解码及数字签名校验来获取其中的用户信息，从而实现认证和授权

