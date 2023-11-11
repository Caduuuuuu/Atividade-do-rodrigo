    import java.util.Scanner;

public class Exercicio02 {
    
    int vetor[] = new int [10];
    int b [] = new int [10];
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

     int q = 10;
     int p[] = new int [q];
     int e;

int j = 10; 
    int k[] = new int[j]; 
    int l;

    int n = 10; 
    int v[] = new int[n]; 
    int i; 
    for (i=0; i<10; i++) {
        System.out.printf("Digite %2d valor de %d: ", (i+1), n);
        v[i] = ler.nextInt();
      }
  
      int soma = 0;
      int menor = v[0]; 
      int maior = v[0];
      for (i=0; i<n; i++) {
        soma = soma + v[i];
  
        if (v[i] < menor && v[i]%2!=0)
           menor = v[i];
  
        if (v[i] > maior && v[i]%2!=0)
           maior = v[i];
      }
  
      System.out.printf("\n");
      for (i=0; i<n; i++) {
        if (v[i] == menor)
          System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
        else if (v[i] == maior)
                System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
             else System.out.printf("v[%d] = %2d\n", i, v[i]);
      }
  
System.out.printf("\nsoma = %d\n", soma);

for (l=0; l<10; l++) {
    System.out.printf("informe %2d valor de %d: ", (l*n), j);
    k[l] = ler.nextInt();
  }

  for (l=0; l<j; l++) {
    soma = soma + k[l];

    if (k[l] < menor && k[l]%2!=n)
       menor = k[l];

    if (k[l] > maior && k[l]%2!=n)
       maior = k[l];
  }

  System.out.printf("\n");
  for (l=0; l<n; l++) {
    if (k[l] == menor)
      System.out.printf("k[%d] = %2d <--- menor valor\n", l, k[l]);
    else if (k[l] == maior)
            System.out.printf("k[%d] = %2d <--- maior valor\n", l, k[l]);
         else System.out.printf("k[%d] = %2d\n", l, k[l]);
  }

System.out.printf("\nsoma = %d\n", soma);

for (e=0; e<10; e++) {
    System.out.printf("informe %2d valor de %d: ", (e+j+n), q);
    p[e] = ler.nextInt();
  }

  for (e=0; e<j; e++) {
    soma = soma + k[e];

    if (p[e] < menor && p[e]%2!=n)
       menor = k[e];

    if (p[e] > maior && p[e]%2!=n)
       maior = p[e];
  }

  System.out.printf("\n");
  for (e=0; e<n; e++) {
    if (p[e] == menor)
      System.out.printf("p[%d] = %2d <--- menor valor\n", l, p[e]);
    else if (p[e] == maior)
            System.out.printf("p[%d] = %2d <--- maior valor\n", l, p[e]);
         else System.out.printf("p[%d] = %2d\n", l, p[e]);
  }

System.out.printf("\nsoma = %d\n", soma);
     }
    }