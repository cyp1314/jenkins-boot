### 添加依赖

```
<plugin>
                <groupId>com.spotify</groupId>
                <artifactId>docker-maven-plugin</artifactId>
                <version>1.1.0</version>
                <executions>
                    <execution>
                        <id>build-image</id>
                        <phase>package</phase>
                        <goals>
                            <goal>build</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <imageName>${project.artifactId}:${project.version}</imageName>
                    <dockerHost>http://10.0.0.37:2375</dockerHost>
                    <baseImage>java:8</baseImage>
                    <entryPoint>["java", "-jar","/${project.build.finalName}.jar"]
                    </entryPoint>
                    <resources>
                        <resource>
                            <targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.build.finalName}.jar</include>
                        </resource>
                    </resources>
                </configuration>
            </plugin>
```



### 提交代码到github

![](https://i.loli.net/2020/08/20/aSEWtcZVIr2hBsn.png)

### jenkins 新建任务

![](https://i.loli.net/2020/08/20/3Q2bvg9XLnmaYCP.png)



![](https://i.loli.net/2020/08/20/5pyJRiBKhMVUmnO.png)



![](https://i.loli.net/2020/08/20/ljA5smbxEoXtSR6.png)



添加构建步骤-调用顶层Mvane

![](https://i.loli.net/2020/08/20/ncyE1i4WVdwGaSO.png)



添加构建步骤-远程执行服务器上的shell脚本

![](https://i.loli.net/2020/08/20/T35GdYD9gwaUuiF.png)



### 立即构建

![](https://i.loli.net/2020/08/20/pdPvVgWBxDzK2ql.png)
