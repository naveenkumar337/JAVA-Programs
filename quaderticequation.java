
/**
 * (-b+squreroot(b^2-4ac))/2*a
 * If determinant is greater than 0, the roots are real and different.//if
	If determinant is equal to 0, the roots are real and equal.//else if
	If determinant is less than 0, the roots are complex and different.//else
 *
 */
public class quaderticequation {

	public static void main(String[] args) {
		int a=1;
		int b=4;
		double c=5.0;
		double determinant=b*b-4*a*c;
		double root1,root2;
		//int dif=b*b;
		if(determinant>0) {
		  root1=(-b+ Math.sqrt(determinant))/(2*a);
		  root2=(-b- Math.sqrt(determinant))/(2*a);
		  System.out.println(root1+"and"+root2);
	}
		else if(determinant==0) {
			root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
		}
		else {
			double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        
			
		}
		}

}
