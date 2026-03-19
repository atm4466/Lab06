import java.util.List;
import java.util.Random;




public class MadLibs{
    public static void main(String[] args) {


    }
    private ArrayList<String> People;
    private ArrayList<String> Nouns;
    private ArrayList<String> Adjectives;
    private ArrayList<String> Verbs;

    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("people.txt"));){
        out.writeObject(People);
    }
    catch(IOException a){
        System.out.println("I hope this is never ran.");

    }
    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("nouns.txt"));){
        out.writeObject(Nouns);
    }
    catch(IOException a){
        System.out.println("I hope this is never ran.");

    }
    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("adjectives.txt"));){
        out.writeObject(Adjectives);
    }
    catch(IOException a){
        System.out.println("I hope this is never ran.");

    }
    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("verbs.txt"));){
        out.writeObject(Verbs);
    }
    catch(IOException a){
        System.out.println("I hope this is never ran.");

    }

    System.output(People,Adjectives, Verbs, Nouns);
    for(word in self.template){
        if(word instanceof Person){
            Random rand = new Random();
            int randomIndex = rand.nextInt(People.size());
            word = People.get(randomIndex);
        }
        else if(word instanceof Noun){
            Random rand = new Random();
            int randomIndex = rand.nextInt(Nouns.size());
            word = Nouns.get(randomIndex);
        }
        else if(word instanceof Adjective){
            Random rand = new Random();
            int randomIndex = rand.nextInt(Adjectives.size());
            word = Adjectives.get(randomIndex);
        }
        else if(word instanceof Verb){
            Random rand = new Random();
            int randomIndex = rand.nextInt(Nouns.size());
            word = Verbs.get(randomIndex);
        }
        else {
            //This is not a big deal, this block is for formatting every other regular word.

        }
    }


}