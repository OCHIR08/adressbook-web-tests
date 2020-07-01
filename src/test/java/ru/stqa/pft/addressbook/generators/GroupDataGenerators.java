package ru.stqa.pft.addressbook.generators;

import ru.stqa.pft.addressbook.model.GroupData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class GroupDataGenerators {

    public static void main (String []args) throws IOException {
        int count = parseInt(args[0]);
        File file = new File(args[1]);

        List<GroupData> groups = generateGroup(count);
        save(groups, file);

    }

    private static void save(List<GroupData> groups, File file) throws IOException {
//        System.out.println(new File(".").getAbsolutePath());
        Writer writer = new FileWriter(file);
        for (GroupData group : groups) {
            writer.write(String.format("%s;%s;%s\n", group.getName(), group.getHeader(), group.getFooter()));
        }
        writer.close();
    }

    private static List<GroupData> generateGroup(int count) {
        List<GroupData> groups = new ArrayList<GroupData>();
        for (int s = 0; s < count; s++ ){
            groups.add(new GroupData().withName(String.format("test $s" , s)).
                    withHeader(String.format("header $s" , s)).withFooter(String.format("footer $s" , s)));
        }
        return groups;
    }
}
