package sg.edu.np.s10207996;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    User user1 = new User("MAD",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin scelerisque facilisis orci in scelerisque. Nam sollicitudin, sem at semper egestas, erat nunc mattis turpis, quis efficitur ligula est cursus risus. Ut varius dapibus nulla at porta. Aenean vel est et est dapibus commodo nec eu tortor. Etiam blandit lacus erat, ac facilisis odio posuere ut. Vivamus a porta ex, vitae bibendum velit. Aliquam sodales arcu a leo pharetra tristique.",
            1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTxt = findViewById(R.id.nameTxt);
        nameTxt.setText(user1.getName());

        TextView desTxt = findViewById(R.id.desTxt);
        desTxt.setText(user1.getDescription());

        Button followBtn = findViewById(R.id.followBtn);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user1.Change();
                if (user1.getFollowed() == false){
                    followBtn.setText("Follow");
                }
                else{followBtn.setText("Unfollow");}
            }
        });




        Log.d("debug", "create");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "restart");
    }
}