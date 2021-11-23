import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;

class Node {
    int coeff;
    int pow;
    Node next;
    Node(int coefficient, int power)
    {
        coeff = coefficient;
        pow = power;
        next = null;
    }
}

class Polynomial {

    public static Node addPolynomial(Node start_Pointer_polynomial1, Node start_Pointer_polynomial2) {

            Node start_pointer1 = start_Pointer_polynomial1;
            Node start_pointer2 = start_Pointer_polynomial2;
            Node newHead = new Node(0, 0);
            Node current_pointer = newHead;

            while (start_pointer1 != null || start_pointer2 != null) {

                if (start_pointer1 == null) {
                    current_pointer.next = start_pointer2;
                    break;
                } else if (start_pointer2 == null) {
                    current_pointer.next = start_pointer1;
                    break;
                } else if (start_pointer1.pow == start_pointer2.pow) {
                    current_pointer.next = new Node(start_pointer1.coeff + start_pointer2.coeff, start_pointer1.pow);

                    start_pointer1 = start_pointer1.next;
                    start_pointer2 = start_pointer2.next;
                } else if (start_pointer1.pow > start_pointer2.pow) {
                    current_pointer.next = new Node(start_pointer1.coeff, start_pointer1.pow);

                    start_pointer1 = start_pointer1.next;
                } else {
                    current_pointer.next = new Node(start_pointer2.coeff, start_pointer2.pow);

                    start_pointer2 = start_pointer2.next;
                }

                current_pointer = current_pointer.next;
            }

            return newHead.next;

    }
}
//Linked List main class
class PolynomialAddition {

    public static void main(String[] args) throws InputMismatchException {
        try {

            Node start_pointer_poly1 = null;
            Node start_pointer_poly2 = null;
            Node current__pointer_poly1 = null;
            Node current__pointer_poly2 = null;

            LinkedList<Integer> list1_coeff = new LinkedList<>();
            LinkedList<Integer> list1_pow = new LinkedList<>();
            LinkedList<Integer> list2_coeff = new LinkedList<>();
            LinkedList<Integer> list2_pow = new LinkedList<>();

            Scanner input = new Scanner(System.in);


            System.out.println("Number of terms in first polynomial : ");
            int number_of_terms_in_first_polynomial = input.nextInt();
            System.out.println("Enter the coefficient of first polynomial : ");
            for (int i = 0; i < number_of_terms_in_first_polynomial; i++) {
                list1_coeff.add(input.nextInt());
            }
            System.out.println("Enter the power of first polynomial : ");
            for (int j = 0; j < number_of_terms_in_first_polynomial; j++) {
                list1_pow.add(input.nextInt());
            }
            int size = list1_coeff.size();
            int i = 0;
            while (size-- > 0) {
                int a = list1_coeff.get(i);
                int b = list1_pow.get(i);

                Node ptr = new Node(a, b);

                if (start_pointer_poly1 == null) {
                    start_pointer_poly1 = ptr;
                } else {
                    current__pointer_poly1.next = ptr;
                }
                current__pointer_poly1 = ptr;

                i++;
            }

            System.out.println("Number of terms in second polynomial : ");
            int number_of_terms_in_second_polynomial = input.nextInt();
            System.out.println("Enter the coefficient of second polynomial : ");
            for (int k = 0; k < number_of_terms_in_second_polynomial; k++) {
                list2_coeff.add(input.nextInt());
            }
            System.out.println("Enter the power of second polynomial : ");
            for (int l = 0; l < number_of_terms_in_second_polynomial; l++) {
                list2_pow.add(input.nextInt());
            }
            size = list2_coeff.size();
            i = 0;
            while (size-- > 0) {
                int a = list2_coeff.get(i);
                int b = list2_pow.get(i);

                Node ptr = new Node(a, b);

                if (start_pointer_poly2 == null) {
                    start_pointer_poly2 = ptr;
                    current__pointer_poly2 = ptr;
                } else {
                    current__pointer_poly2.next = ptr;
                    current__pointer_poly2 = ptr;
                }

                i++;
            }

            Polynomial obj = new Polynomial();

            Node sum = obj.addPolynomial(start_pointer_poly1, start_pointer_poly2);
            System.out.println("The sum of polynomial is : ");
            while (sum != null) {
                System.out.print(sum.coeff + "x^" + sum.pow);
                if (sum.next != null)
                    System.out.print(" + ");
                sum = sum.next;
            }
            System.out.println();
        } catch (Exception e) {

            System.out.println("Please enter a number");

        }
    }
}
