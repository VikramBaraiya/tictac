package Yadunandan.TicTacToe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Start_game extends AppCompatActivity {
    TextView t=findViewById(R.id.textView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        Bundle Name= getIntent().getExtras();
        String playername=Name.getString("player");
        //Toast.makeText(getApplicationContext(),playername,Toast.LENGTH_LONG).show();
    t.setText(playername);
    }
}
