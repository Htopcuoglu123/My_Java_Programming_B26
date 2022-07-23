package Unit5review.quiz;

public class File {
    /*
    create a class File

  instance variables:
   - name (String)
   - size (double)

     */
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    public void openFile(){
        System.out.println("Opening "+name);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
