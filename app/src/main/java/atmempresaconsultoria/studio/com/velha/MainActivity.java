package atmempresaconsultoria.studio.com.velha;

import android.graphics.Color;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    private Switch switchDoisJogadores;
    private TextView textViewResult;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonReset;

    int[] j = new int[9];
    boolean play2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchDoisJogadores = (Switch) findViewById(R.id.switchDoisJogadoresId);
        textViewResult = (TextView) findViewById(R.id.textViewResultId);
        button1 = (Button) findViewById(R.id.button1Id);
        button2 = (Button) findViewById(R.id.button2Id);
        button3 = (Button) findViewById(R.id.button3Id);
        button4 = (Button) findViewById(R.id.button4Id);
        button5 = (Button) findViewById(R.id.button5Id);
        button6 = (Button) findViewById(R.id.button6Id);
        button7 = (Button) findViewById(R.id.button7Id);
        button8 = (Button) findViewById(R.id.button8Id);
        button9 = (Button) findViewById(R.id.button9Id);
        buttonReset = (Button) findViewById(R.id.buttonResetId);
        
        int tLetra = 50;
        button1.setTextSize(tLetra);
        button2.setTextSize(tLetra);
        button3.setTextSize(tLetra);
        button4.setTextSize(tLetra);
        button5.setTextSize(tLetra);
        button6.setTextSize(tLetra);
        button7.setTextSize(tLetra);
        button8.setTextSize(tLetra);
        button9.setTextSize(tLetra);

        switchDoisJogadores.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    play2 = true;
                } else {
                    play2 = false;
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setEnabled(false);
                if (quemJoga()){
                    button1.setText("X");
                } else {
                    button1.setText("O");
                }

                try {
                    jogar(1);
                } catch (IOException ex) {
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setEnabled(false);
                if(quemJoga()){
                    button2.setText("X");
                } else {
                    button2.setText("O");
                }

                try {
                    jogar(2);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setEnabled(false);
                if (quemJoga()){
                    button3.setText("X");
                } else {
                    button3.setText("O");
                }
                try {
                    jogar(3);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setEnabled(false);
                if (quemJoga()) {
                    button4.setText("X");
                } else {
                    button4.setText("O");
                }
                try {
                    jogar(4);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setEnabled(false);
                if (quemJoga()) {
                    button5.setText("X");
                } else {
                    button5.setText("O");
                }
                try {
                    jogar(5);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setEnabled(false);
                if (quemJoga()) {
                    button6.setText("X");
                } else {
                    button6.setText("O");
                }
                try {
                    jogar(6);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setEnabled(false);
                if (quemJoga()) {
                    button7.setText("X");
                } else {
                    button7.setText("O");
                }
                try {
                    jogar(7);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setEnabled(false);
                if (quemJoga()) {
                    button8.setText("X");
                } else {
                    button8.setText("O");
                }
                try {
                    jogar(8);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setEnabled(false);
                if (quemJoga()) {
                    button9.setText("X");
                } else {
                    button9.setText("O");
                }
                try {
                    jogar(9);
                } catch (IOException ex){
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 9; i++) {
                    j[i] = 0;
                }
                String textoAzul = "#81d4fa";
                textViewResult.setText("");
                textViewResult.setTextColor(Color.GRAY);
                button1.setEnabled(true);
                button1.setText("");
                button1.setTextColor(Color.parseColor(textoAzul));
                button2.setEnabled(true);
                button2.setText("");
                button2.setTextColor(Color.parseColor(textoAzul));
                button3.setEnabled(true);
                button3.setText("");
                button3.setTextColor(Color.parseColor(textoAzul));
                button4.setEnabled(true);
                button4.setText("");
                button4.setTextColor(Color.parseColor(textoAzul));
                button5.setEnabled(true);
                button5.setText("");
                button5.setTextColor(Color.parseColor(textoAzul));
                button6.setEnabled(true);
                button6.setText("");
                button6.setTextColor(Color.parseColor(textoAzul));
                button7.setEnabled(true);
                button7.setText("");
                button7.setTextColor(Color.parseColor(textoAzul));
                button8.setEnabled(true);
                button8.setText("");
                button8.setTextColor(Color.parseColor(textoAzul));
                button9.setEnabled(true);
                button9.setText("");
                button9.setTextColor(Color.parseColor(textoAzul));
            }
        });
    }

    //atribui valor no vetor
    public void jogar(int jogador) throws IOException {
        for (int i = 0; i < 9; i++) {
            if (j[i] == 0) {
                j[i] = jogador;
                verificaVencedor(5);
                verificaVencedor(4);
                if (!play2) {
                    j[i + 1] = jogadas(j);
                    Ia(j[i + 1]);
                    verificaVencedor(4);
                }
                break;
            } else {
                if (i == 7) {
                    textViewResult.setText("Empatou");
                    break;
                }
            }
        }

    }

    //atribui texto ao botao
    public void Ia(int pres) {
        switch (pres) {
            case 1:
                button1.setEnabled(false);
                button1.setText("O");
                break;
            case 2:
                button2.setEnabled(false);
                button2.setText("O");
                break;
            case 3:
                button3.setEnabled(false);
                button3.setText("O");
                break;
            case 4:
                button4.setEnabled(false);
                button4.setText("O");
                break;
            case 5:
                button5.setEnabled(false);
                button5.setText("O");
                break;
            case 6:
                button6.setEnabled(false);
                button6.setText("O");
                break;
            case 7:
                button7.setEnabled(false);
                button7.setText("O");
                break;
            case 8:
                button8.setEnabled(false);
                button8.setText("O");
                break;
            case 9:
                button9.setEnabled(false);
                button9.setText("O");
                break;
        }
    }

    //muda a cor do vencedor
    public void pintarWin(Button a, Button b, Button c, int tamanho) {
        if (tamanho % 2 == 0) {
            a.setTextColor(Color.parseColor("#ef5350"));
            b.setTextColor(Color.parseColor("#ef5350"));
            c.setTextColor(Color.parseColor("#ef5350"));
        } else {
            a.setTextColor(Color.parseColor("#66bb6a"));
            b.setTextColor(Color.parseColor("#66bb6a"));
            c.setTextColor(Color.parseColor("#66bb6a"));
        }

    }

    //procura a proxima jogada
    public int jogadas(int[] j) throws IOException {
        String[] jogadasString = this.leitura();
        int jogue = 0;
        boolean acho = false;
        for (int i = 0; i < jogadasString.length; i++) {
            for (int k = 0; k < 8; k++) {
                if (jogadasString[i].charAt(k) == Character.forDigit(j[k], 10)) {
                    if (j[k + 1] == 0 && jogadasString[i].charAt(k) == Character.forDigit(j[k], 10)) {
                        jogue = Character.getNumericValue(jogadasString[i].charAt(k + 1));
                        acho = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (acho) {
                break;
            }
        }
        return jogue;
    }

    //ler arquivo txt com as possiveis jogadas
    public String[] leitura() throws IOException {
        String linha = "132946000 132956000 132967450 132967580 132967850 132976000 132986000 134725000 134756290 134756890 134756900 134765000 134785000 134795000 135926000 135946000 135964297 135964782 135964827 135976000 135986000 136527000 136547000 136574289 136574892 136574982 136587000 136597000 137425698 137425860 137425960 137459260 137459628 137459860 137465289 137465892 137465982 137489260 137489560 137489652 137495260 137495682 137495800 138926000 138946000 138956000 138965270 138965470 138965742 138976000 139527000 139547000 139567000 139578246 139578400 139578620 139587000 251347000 251367000 251374698 251374860 251374960 251387000 251397000 253149000 253169000 253179000 253189000 253196478 253196740 253196840 254139000 254169000 254179000 254189000 254193670 254193786 254193870 256317000 256347000 256371490 256371890 256371984 256387000 256397000 257139000 257149000 257189000 257198364 257198436 257198634 258139000 258149000 258169000 258179000 258197340 258197430 258197630 259317000 259347000 259367000 259378146 259378416 259378614 259387000 312749580 312749680 312749850 312754000 312764000 312784000 312794000 314529000 314569000 314579000 314589000 314596278 314596782 314596872 315724000 315746289 315746829 315746928 315764000 315784000 315794000 316925000 316945000 316957240 316957400 316957840 316975000 316985000 317529000 317549000 317569000 317589000 317596240 317596482 317596800 318724000 318745290 318745690 318745962 318754000 318764000 318794000 319624570 319624750 319624850 319647258 319647528 319647852 319657240 319657482 319657840 319675240 319675482 319675800 319687240 319687452 319687540 451723000 451732680 451732896 451732980 451763000 451783000 451793000 452139000 452169000 452179000 452189000 452193670 452193786 452193870 453129000 453169000 453179000 453189000 453196278 453196782 453196872 456129000 456139000 456179000 456189000 456193270 456193720 456193870 457129000 457139000 457169000 457189000 457198236 457198320 457198620 458713000 458723000 458736129 458736219 458736912 458763000 458793000 459713000 459723000 459736128 459736218 459736812 459763000 459783000 512837490 512837690 512837940 512846379 512846739 512846973 512846973 512864370 512864739 512864970 512873469 512873649 512873946 512897340 512897463 512897640 513724000 513746289 513746829 513746928 513764000 513784000 513794000 514628379 514628739 514628937 514637289 514637829 514637982 514673290 514673890 514673920 514682379 514682730 514682930 514692378 514692730 514692830 516427000 516437000 516473289 516473820 516473920 516487000 516497000 517328469 517328649 517328964 517342000 517362000 517382000 517392000 518237469 518237640 518237940 518243000 518263000 518273000 518293000 519328467 519328647 519328746 519342000 519362000 519372000 519382000 651327000 651347000 651374298 651374892 651374982 651387000 651397000 652317000 652347000 652371490 652371890 652371984 652387000 652397000 653912480 653912780 653912874 653921000 653941000 653971000 653981000 654129000 654139000 654179000 654189000 654193270 654193720 654193870 657914238 657914328 657914832 657921000 657931000 657941000 657981000 658913270 658913470 658913742 658921000 658931000 658941000 658971000 659317000 659327000 659347000 659378120 659378214 659378420 659387000 791423560 791423658 791423860 791435200 791435628 791435860 791453260 791453628 791453860 791465238 791465328 791465832 791486250 791486350 791486530 792316000 792346000 792356000 792365148 792365410 792365810 792386000 793512400 793512680 793512846 793521000 793541000 793561000 793581000 794125000 794135000 794153260 794153600 794153860 794165000 794185000 795316000 795326000 795346000 795364128 795364281 795364821 795386000 796314258 796314528 796314852 796325148 796325410 796325810 796345100 796345210 796345810 796354128 796354281 796354821 796381250 796381450 796381520 798613000 798623000 798635140 798635210 798635410 798643000 798653000 851723000 851732496 851732694 851732964 851743000 851763000 851793000 852139000 852149000 852169000 852179000 852197340 852197430 852197630 853912476 853912674 853912746 853921000 853941000 853961000 853971000 854713000 854723000 854731290 854731690 854731962 854763000 854793000 856913270 856913470 856913742 856921000 856931000 856941000 856971000 857914260 857914360 857914632 857921000 857931000 857941000 857961000 859713000 859723000 859736140 859736240 859736412 859743000 859763000 971523000 971532480 971532600 971432864 971543000 971563000 971583000 972134000 972145368 972145630 972145830 972154000 972164000 972184000 973615200 973615428 973615840 973621458 973621540 973621840 973641258 973641528 973641852 973651240 973651428 973651840 973684150 973684250 973684510 974513000 974523000 974536128 974536218 974536812 974563000 974583000 975124000 975134000 975146283 975146382 975146823 975164000 975184000 976315000 976325000 976345000 976351240 976351400 976351840 976385000 978415230 978415360 978415630 978421000 978431000 978451000 978461000";
        return linha.split(" ");
    }

    public void verificaVencedor(int tamanho){
        int p[] = new int[tamanho];
        int aux;
        if (tamanho%2 == 0){
            aux = 1;
        } else {
            aux = 0;
        }
        for (int k = 0; k < tamanho; k++) {
            p[k] = j[aux];
            aux += 2;
        }
        boolean fim = false;

        for (int k = 0; k < tamanho; k++) {
            for (int l = 0; l < tamanho; l++) {
                for (int m = 0; m < tamanho; m++) {
                    if (k != l && k != m && l != m) {
                        switch (p[k]) {
                            case 1:
                                switch (p[l]) {
                                    case 2:
                                        if (p[m] == 3) {
                                            pintarWin(button1, button2, button3, p.length);
                                            fim = true;
                                        }
                                        break;
                                    case 4:
                                        if (p[m] == 7) {
                                            pintarWin(button1, button4, button7, p.length);
                                            fim = true;
                                        }
                                        break;
                                    case 5:
                                        if (p[m] == 9) {
                                            pintarWin(button1, button5, button9, p.length);
                                            fim = true;
                                        }
                                        break;
                                }
                                break;
                            case 2:
                                switch (p[l]) {
                                    case 5:
                                        if (p[m] == 8) {
                                            pintarWin(button2, button5, button8, p.length);
                                            fim = true;
                                        }
                                        break;
                                }
                                break;
                            case 3:
                                switch (p[l]) {
                                    case 5:
                                        if (p[m] == 7) {
                                            pintarWin(button3, button5, button7, p.length);
                                            fim = true;
                                        }
                                        break;
                                    case 6:
                                        if (p[m] == 9) {
                                            pintarWin(button3, button6, button9, p.length);
                                            fim = true;
                                        }
                                        break;
                                }
                                break;
                            case 4:
                                switch (p[l]) {
                                    case 5:
                                        if (p[m] == 6) {
                                            pintarWin(button4, button5, button6, p.length);
                                            fim = true;
                                        }
                                        break;
                                }
                                break;
                            case 7:
                                switch (p[l]) {
                                    case 8:
                                        if (p[m] == 9) {
                                            pintarWin(button7, button8, button9, p.length);
                                            fim = true;
                                        }
                                }
                                break;
                        }
                    }

                    if (fim) {
                        break;
                    }
                }
                if (fim) {
                    break;
                }
            }
            if (fim) {
                break;
            }
        }

        if (play2){

            if (fim && tamanho % 2 == 0) {
                textViewResult.setText("O Ganhou");
                textViewResult.setTextColor(Color.parseColor("#ef5350"));
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            } else if (fim && tamanho % 2 == 1) {
                textViewResult.setText("X Ganhou");
                textViewResult.setTextColor(Color.parseColor("#66bb6a"));
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }

        } else {
            if (fim && tamanho % 2 == 0) {
                textViewResult.setText("Perdeu");
                textViewResult.setTextColor(Color.parseColor("#ef5350"));
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            } else if (fim && tamanho % 2 == 1) {
                textViewResult.setText("Ganhou");
                textViewResult.setTextColor(Color.parseColor("#66bb6a"));
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
            }
        }
    }

    public boolean quemJoga(){
        boolean x = true;
        for(int i = 0; i < 9; i++) {
            if (j[i] == 0) {
                int mod = i%2;
                if (mod == 0) {
                    x = true;
                } else {
                    x = false;
                }
                break;
            }
        }

        return x;
    }

}