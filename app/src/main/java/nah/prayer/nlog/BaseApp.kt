package nah.prayer.nlog

import android.app.Application
import nah.prayer.nloglib.Nlog

class BaseApp : Application() {
    init {
        appInstance = this
    }

    override fun onTerminate() {
        super.onTerminate()
        appInstance = null
    }

    override fun onCreate() {
        super.onCreate()

        //Nlog 생성
        //new Nlog(this);
        //Nlog 생성, tag 변경
        Nlog(this, "NewTag")

    }

    companion object {

        var appInstance: BaseApp? = null
    }


}
