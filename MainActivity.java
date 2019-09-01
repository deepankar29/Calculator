package deepu.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dec;
    private Button zero;
    private Button equal;
    private Button clear;
    private Button add;
    private Button sub;
    private Button multi;
    private Button div;
    private TextView info;
    private TextView result;
    private  final char ADD = '+';
    private  final char SUB = '-';
    private  final char MULTI = '*';
    private  final char DIV = '/';
    private  final char Equal = 0;
    private  double val1= Double.NaN;
    private  double val2;
    private  char Action;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Setup();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+"9");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                  Compute();
                  Action=ADD;
                  result.setText(String.valueOf(val1) + "+");
                  info.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Compute();
                Action=SUB;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Compute();
                Action=MULTI;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Compute();
                Action=DIV;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Compute();
                Action=Equal;
                result.setText(String.valueOf(val1));
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(info.getText().length()>0)
                {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });



    }
    private void Setup()
    {
        zero = (Button)findViewById(R.id.bt0);
        one = (Button)findViewById(R.id.bt1);
        two = (Button)findViewById(R.id.bt2);
        three = (Button)findViewById(R.id.bt3);
        four = (Button)findViewById(R.id.bt4);
        five = (Button)findViewById(R.id.bt5);
        six = (Button)findViewById(R.id.bt6);
        seven = (Button)findViewById(R.id.bt7);
        eight = (Button)findViewById(R.id.bt8);
        nine = (Button)findViewById(R.id.bt9);
        add = (Button)findViewById(R.id.adds);
        sub = (Button)findViewById(R.id.sub);
        multi = (Button)findViewById(R.id.multi);
        div = (Button)findViewById(R.id.div);
        equal = (Button)findViewById(R.id.equal);
        clear = (Button)findViewById(R.id.clr);
        info=(TextView)findViewById(R.id.tvcontrol);
        result=(TextView)findViewById(R.id.tvdisplay);



    }

    private void Compute()
    {
        if(!Double.isNaN(val1))
        {

            val2=Integer.parseInt(info.getText().toString());
            switch (Action)
            {
                case ADD:
                    val1=val1+val2;
                    break;
                case SUB:
                    val1=val1-val2;
                    break;
                case MULTI:
                    val1=val1*val2;
                    break;
                case DIV:
                    val1=val1/val2;
                    break;
                case Equal:
                    break;

            }

        }
        else
            {
                val1=Integer.parseInt(info.getText().toString());
            }

    }
}
