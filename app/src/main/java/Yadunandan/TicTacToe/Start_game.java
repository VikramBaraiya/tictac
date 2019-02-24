package Yadunandan.TicTacToe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Start_game extends AppCompatActivity implements View.OnClickListener{

    static int count=0;
    Button r11,r12,r13,r21,r22,r23,r31,r32,r33;
    String r11str,r12str,r13str,r21str,r22str,r23str,r31str,r32str,r33str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        r11=findViewById(R.id.r11);
        r12=findViewById(R.id.r12);
        r13=findViewById(R.id.r13);
        r21=findViewById(R.id.r21);
        r22=findViewById(R.id.r22);
        r23=findViewById(R.id.r23);
        r31=findViewById(R.id.r31);
        r32=findViewById(R.id.r32);
        r33=findViewById(R.id.r33);
/*r11.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
    }
});*/
        r11.setOnClickListener(this);
        r12.setOnClickListener(this);
        r13.setOnClickListener(this);
        r21.setOnClickListener(this);
        r22.setOnClickListener(this);
        r23.setOnClickListener(this);
        r31.setOnClickListener(this);
        r32.setOnClickListener(this);
        r33.setOnClickListener(this);



      }

      public void toggle(Button b)
      {
          if(count!=9)
          {
              String value="";
              b.setEnabled(false);
              if(count%2==0)
                  value="X";
              else
                  value="O";
              b.setText(value);
              count++;

          }
          else
          {

          }

      }
      public void updateText()
      {
          r11str=r11.getText().toString();
          r12str=r12.getText().toString();
          r13str=r13.getText().toString();
          r21str=r21.getText().toString();
          r22str=r22.getText().toString();
          r23str=r23.getText().toString();
          r31str=r31.getText().toString();
          r32str=r32.getText().toString();
          r33str=r33.getText().toString();




      }
    @Override
    public void onClick(View v) {
        String value= "";
//        String r11str,r12str,r13str,r21str,r22str,r23str,r31str,r32str,r33str;
        switch (v.getId()){
            case R.id.r11:
                toggle(r11);

                //check winner
                if(count>4)
                {
  //                  r11str=r11.getText().toString();
                         updateText();
                         if(r11str.equals(r12str) && r11str.equals(r13str))
                         {
                             Toast.makeText(getApplicationContext(),"you won",Toast.LENGTH_SHORT).show();
                         }
                }




               break;
            case R.id.r12:
                toggle(r12);
                break;
            case R.id.r13:
                toggle(r13);
                break;
            case R.id.r21:
                toggle(r21);
                break;
            case R.id.r22:
                toggle(r22);
                break;
            case R.id.r23:
                toggle(r23);
                break;
            case R.id.r31:
                toggle(r31);
                break;
            case R.id.r32:
                toggle(r32);
                break;
            case R.id.r33:
                toggle(r33);
                break;

        }
    }
}
