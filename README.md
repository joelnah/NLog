#Nlog

maven { url 'https://jitpack.io' }

implementation 'com.github.joelnah:NLog:Tag'

*BaseApp

        //Nlog 생성
        
        new Nlog(this);
        
        //Nlog 생성, tag 변경 (defaut : nah)
        
        new Nlog(this, "NewTag")
        
*Activity

Nlog.d("This is Log test.");


Nlog.mem();
