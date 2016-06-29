# DemoAar
如何将Module依赖改为aar依赖（aar依赖可以有效地减少编译时间）


#1、初始化项目
项目中有两个Module，MyApp是app module的，MyModule是lib module

#2、生成aar文件
调用 gradle projects(在窗口的右边)>:lib>Tasks>build>assembleRelease。
会在 Project目录>MyModule>build>outputs>aar>下生成mymodule-release.aar文件。

#3、添加aar依赖
修改MyApp的build.gradle文件

    /*----------将aar包放在libs目录下（也可以是其它目录，只要对应就行）----------*/
    repositories {
        flatDir {
            dirs 'libs'
        }
    }

    dependencies {
        compile fileTree(include: ['*.jar'], dir: 'libs')
        testCompile 'junit:junit:4.12'
        compile 'com.android.support:appcompat-v7:24.0.0'

        /*----------将module依赖改为aar依赖----------*/
//    compile project(':MyModule')
        compile name:'mymodule-release',ext:'aar'
    }
    

#4、完成，可以在MyApp中调用该aar了

import com.simon.mymodule.ModuleUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModuleUtil.moduleMethod(this);
    }
}

