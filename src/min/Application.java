package min;

import java.io.*;
import java.lang.reflect.Field;

public class Application {
    public static void main(String[] args) throws Exception {
        File file = new File("fields.txt");
        serializeAnnotationFields(Vehicle.class, file);
    }

    public static void serializeAnnotationFields(Class<?> c, File file) throws Exception {
        Writer writer = new FileWriter(file);
        Field [] fields = c.getDeclaredFields();
        for (Field f : fields)
            if (f.getAnnotation(FieldInfo.class) instanceof FieldInfo) {
                System.out.println(f.getType() + " | \"" + f.getName() + "\" with annotation - " +
                        f.getAnnotation(FieldInfo.class).value());
                writer.write(f.toString() + "\n");
            }
        writer.close();
        System.out.println("This fields are serialized without annotation!");

    }
}
