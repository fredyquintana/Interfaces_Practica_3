import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class MarcoAreaTexto extends JFrame {
    private final JTextArea areaTexto1;
    private final JTextArea areaTexto2;
    private final JButton botonCopiar;

    public MarcoAreaTexto() {
        super("Demostracion de JTextArea");
        Box cuadro = Box.createHorizontalBox();
        String demo = "Esta es una cadena de\ndemostracion para\n" +
                "ilustrar como copiar texto\nde un area de texto a \n" +
                "otra, usando un\nevento externo\n";
        areaTexto1 = new JTextArea(demo, 10, 15);
        cuadro.add(new JScrollPane(areaTexto1));

        botonCopiar = new JButton("Copiar >>>");
        cuadro.add(botonCopiar);
        botonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                areaTexto2.setText(areaTexto1.getSelectedText());
            }
        });
        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2)); // agrega panel de desplazamiento
        add(cuadro); // agrega cuadro al marco

    }

}