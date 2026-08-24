class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin =0;
        double Fahrenheit =0 ;

        double arr[] =new double[2];

        Kelvin = celsius + 273.15;
        Fahrenheit = celsius * 1.80 + 32.00;
         
        arr[0]= Kelvin;
        arr[1]=Fahrenheit;
            return  arr;
    }
}