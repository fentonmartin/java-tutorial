class buatsegitigabalik {
public static void main(String[]args) {
  System.out.println("\n\tHello, welcome to \"fencode.blogspot.com\".");
  System.out.println("\t       visit : \"bit.ly/fencode\"\n\n");

int k = 1;
int l = 10;
for(int i = 0; i < 10; i++) {
  for(int a = 0; a < l; a++) {
    System.out.print("  ");
  }
  for(int b = 0; b < k; b++) {
    System.out.print(" *");
  }
  System.out.println("");
  k = k + 1;
  l = l - 1;
}
}
}
