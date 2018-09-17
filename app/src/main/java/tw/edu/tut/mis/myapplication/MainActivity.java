package tw.edu.tut.mis.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Android Studio 3.1 裡面有的bug，xml元件圖的樣板沒有初始設定好
    //導致畫面顯示不出來。

    //解決方法：到app/res/values/styles.xml 裡面
    //將約莫第四行的程式碼加上Base. 就好
    // <style name="AppTheme" parent="Base.Theme.AppCompat.Light.DarkActionBar">

    private final String TAG = "Dylan MainActivity ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //logcat 訊息操作： i d w e ， 分別為： 資訊、除錯、警告、錯誤
        //在logcat 上方有個下拉式選單可以過濾訊息等級...
        //通常都會宣告一個字串，用來代替tag


        Log.i(TAG,"this is imformation"); //訊息
        Log.d(TAG,"this is debug"); // 除錯
        Log.w(TAG,"this is warning"); //警告
        Log.e(TAG,"this is error"); //錯誤
    }
}
