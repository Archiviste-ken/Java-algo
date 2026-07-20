// Sometimes Java won't convert types automatically.

class typeCasting {

    public static void main(String[] args) {
        int a = 10;
        double b = a;

        System.out.println(b);

// Output
// 10.0
// Automatic conversion.    
        // Reverse?
        double x = 9.8;
        int y = (int) x;

        System.out.println(y);
//         Output

// 9
// Decimal part disappears.
//         🧠 Why does this matter?
// Many DSA questions involve averages.
// Wrong:
// int avg = 5 / 2;
// Output
// 2
// Correct:
// double avg = (double)5 / 2;
// Output
// 2.5
// This mistake appears surprisingly often in interviews.
    }
    }
