1.  *****
    *****
    *****
    *****
    *****

code:

public class Main
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}


=====================================================

2.  *
    **
    ***
    ****
    *****


code :

public class Main
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
		    for(int j=0;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}



====================================================



3.  *****
    ****
    ***
    **
    *

code:


public class Main
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--){
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}

====================================================



4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5


code :

public class Main
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}
}



================================================


5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *


code :


public class Main
{
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=1; i<=2*n; i++) {

			if(i<=n) {
				for(int j=1; j<=i; j++) {
					System.out.print("* ");

				}
				System.out.println();
			}
			else {
				for(int x=1; x<=i-(2*k); x++)
				{
					System.out.print("* ");

				}
				k++;
				System.out.println();
			}

		}
	}
}


===================================================



6.       *
        **
       ***
      ****
     *****

code:

public class Main
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    for(int space=1;space<=n-i;space++){
		        System.out.print(" ");
		    }
		    for(int star=1;star<=i;star++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}



=============================================================


7.   *****
      ****
       ***
        **
         *

code:

public class Main
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    for(int space=1;space<=i-1;space++){
		        System.out.print(" ");
		    }
		    for(int star=(n-i)+1;star>=1;star--){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}



===========================================================




8.      *
       ***
      *****
     *******
    *********



code:


public class Main
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    for(int space=1;space<=n-i;space++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=(2*i)-1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}



=========================================================



9.  *********
     *******
      *****
       ***
        *



code:

public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int k=1;
		for(int i=1;i<=n;i++){
		    for(int space=1;space<=i-1;space++){
		        System.out.print(" ");
		    }
		    for(int j=(2*n)-k;j>=1;j--){
		        System.out.print("*");
		        
		    }
		    k=k+2;
		    System.out.println();
		}
	}
}


=============================================================


10.      *
        * *
       * * *
      * * * *
     * * * * *


code:

public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int k=1;
		for(int i=1;i<=n;i++){
		    for(int space=1;space<=(n-i);space++){
		        System.out.print(" ");
		    }
		    for(int star=1;star<=i;star++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}



==================================================================


11.  * * * * *
      * * * *
       * * *
        * *
         *

code:



public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int k=1;
		for(int i=1;i<=n;i++){
		    for(int space=1;space<i;space++){
		        System.out.print(" ");
		    }
		    for(int star=1;star<=n-i+1;star++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}


===============================================================



12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *



code:


public class Main
{
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=1; i<=2*n; i++) {
			if(i<=5) {
				for(int space=1; space<i; space++) {
					System.out.print(" ");
				}
				for(int star=1; star<=n-i+1; star++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for(int space=1; space<=n-k; space++) {
					System.out.print(" ");
					
				}
				k++;
				for(int star=1; star<=i-n; star++) {

					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}



================================================================

13.      *
        * *
       *   *
      *     *
     *********

code:

Basic:

public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int k=1;
		for(int i=1;i<=n;i++){
		    for(int Fspace=1;Fspace<=n-i;Fspace++){
		        System.out.print(" ");
		    }
		    System.out.print("*");
		    if(i!=1 && i!=n){
		        for(int midSpace=1;midSpace<=k;midSpace++){
		        System.out.print(" ");
		    }
		    System.out.print("*");
		    k=k+2;
		    }
		    
		    if(i==n){
		        for(int j=1;j<=(2*n)-2;j++){
		        System.out.print("*");
		    }
		    }
		    System.out.println();
		    
		}
	}
}


efficient:







