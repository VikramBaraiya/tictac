package Yadunandan.TicTacToe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MultiMain extends AppCompatActivity {

    Button begin;
    EditText player,opponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_main);
        player=findViewById(R.id.Player);
        opponent=findViewById(R.id.Opponent);

        begin=findViewById(R.id.Start);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent i =new Intent(getApplicationContext(),Start_game.class);

                startActivity(new Intent(getApplicationContext(),Start_game.class));
            }
        });


    }
}
