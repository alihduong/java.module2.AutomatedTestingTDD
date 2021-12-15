package Triangle;

public class Triangle {
    public static String triangle(int a, int b, int c) {
        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a + b > c && b + c > a && c + a > b){
            if (a==b || b ==c || c == a){
                return "Tam giác Cân";
            }else {
                return "Tam giác thường";
            }
        } else {
            return "không là Tam giác";
        }
    }
}
