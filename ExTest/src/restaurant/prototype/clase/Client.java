package restaurant.prototype.clase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client implements IClient {

    private String nume;
    private List<String> mancaruriPreferate;

    public Client(String nume) {
        this.nume = nume;
        mancaruriPreferate = new ArrayList<>();
        // try {
        // BufferedReader bufferedReader = new BufferedReader(new
        // FileReader("mancaruri"));
        // String line;
        // while ((line = bufferedReader.readLine()) != null) {
        // this.mancaruriPreferate.add(line);
        // }
        // } catch (FileNotFoundException e) {
        // throw new RuntimeException(e);
        // } catch (IOException e) {
        // throw new RuntimeException(e);
        // }
        File file = new File("mancaruri");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.mancaruriPreferate.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", mancaruriPreferate=").append(mancaruriPreferate);
        sb.append('}');
        return sb.toString();
    }

    public Client() {
    }

    @Override
    public IClient cloneaza() {
        Client client = new Client();
        client.nume = this.nume;
        client.mancaruriPreferate = new ArrayList<>();
        for (String mancarePreferata : this.mancaruriPreferate) {
            client.mancaruriPreferate.add(mancarePreferata);
        }
        return client;
    }
}
