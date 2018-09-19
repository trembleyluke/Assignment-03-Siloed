public class Main {

    public static void main(String[] args) {

        float h1 = 72.0f;
        float h2 = 19.0f;
        float h3 = 50.0f;
        float h4 = 67.0f;
        float h5 = 16.0f;
        float h6 = 53.0f;
        float h7 = 69.0f;
        float h8 = 30.0f;
        float h9 = 52.0f;
        float h10 = 40.0f;
        float h11 = 31.0f;
        float h12 = 75.0f;

        float d1 = 22.0f;
        float d2 = 18.0f;
        float d3 = 13.0f;
        float d4 = 16.0f;
        float d5 = 14.0f;
        float d6 = 23.0f;
        float d7 = 22.0f;
        float d8 = 22.0f;
        float d9 = 23.0f;
        float d10 = 16.0f;
        float d11 = 18.0f;
        float d12 = 23.0f;

        float pi = 3.14f;
        int pop = 37640;
        int days = 28;
        float meters = 0.246f;

        float towerVol1 = pi*(d1/2)*(d1/2)*h1;
        float towerVol2 = pi*(d2/2)*(d2/2)*h2;
        float towerVol3 = pi*(d3/2)*(d3/2)*h3;
        float towerVol4 = pi*(d4/2)*(d4/2)*h4;
        float towerVol5 = pi*(d5/2)*(d5/2)*h5;
        float towerVol6 = pi*(d6/2)*(d6/2)*h6;
        float towerVol7 = pi*(d7/2)*(d7/2)*h7;
        float towerVol8 = pi*(d8/2)*(d8/2)*h8;
        float towerVol9 = pi*(d9/2)*(d9/2)*h9;
        float towerVol10 = pi*(d10/2)*(d10/2)*h10;
        float towerVol11 = pi*(d11/2)*(d11/2)*h11;
        float towerVol12 = pi*(d12/2)*(d12/2)*h12;
        float totalVol = towerVol1+towerVol2+towerVol3+towerVol4+towerVol5+towerVol6+towerVol7+towerVol8+towerVol9+towerVol10+towerVol11+towerVol12;

        float usage = pop * meters * days;
        float difference = usage - totalVol;
        float saved = difference/(37640*28);

        System.out.print("The amount of water needed to be saved per person each day is " + saved + " gallons" );



    }
}
