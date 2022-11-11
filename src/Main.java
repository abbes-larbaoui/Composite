public class Main {


    public static void main(String[] args) {
        Folder folder1, folder2, folder3;
        File f1, f2, f3, f4;

        // Folder 1 -> file1, file2 and folder2:
        folder1 = new Folder();

        f1 = new File(5);

        f2 = new File(10);
        folder1.add(f1);
        folder1.add(f2);

        folder2 = new Folder();

        f3 = new File(5);
        folder2.add(f3);

        folder1.add(folder2);

        // Folder 3 -> f4:
        folder3 = new Folder();

        f4 = new File(10);
        folder3.add(f4);

        System.out.println("Folder 1 size: " + folder1.getSize());
        System.out.println("Folder 2 size: " + folder2.getSize());
        System.out.println("Folder 3 size: " + folder3.getSize());
    }
}