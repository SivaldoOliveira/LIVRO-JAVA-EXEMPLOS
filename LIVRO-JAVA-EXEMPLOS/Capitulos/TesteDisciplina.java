import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args){
        Disciplina dis = new Disciplina();

        String str = "Dados da disciplina: ";
        str += "\n" + dis.getCodigo() + ": " + dis.getDescricao();
        JOptionPane.showMessageDialog(null, str);

        dis.setCodigo(1);
        dis.setDescricao("Programação III");

        str = "Dados da disciplina";
        str += "\n"+ dis.getCodigo()+ ": "+ dis.getDescricao();
        JOptionPane.showMessageDialog(null,str);

        dis.setCodigo(-15);
        dis.setDescricao("Pro");

        str ="Dados da disciplina: ";
        str +="\n"+ dis.getCodigo()+ ": "+ dis.getDescricao();
        JOptionPane.showMessageDialog(null, str);

        System.exit(0);
    }
    
}
