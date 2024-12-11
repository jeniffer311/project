class Vowconsonent{
    public static void main(String args[]){
        char c='l';
        Switch(c){
            case 'a','e','i','o','u':
                System.out.println(c+" is a vowel");
                break;
            default:
                System.out.println(c+" is a consonant");
                break;

        }
    }
}