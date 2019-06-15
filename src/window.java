import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame {

    BST bst = new BST();

    private JLabel msg;
    private JButton addNodeButton;
    private JButton deleteNodeButton;
    private JButton displayTreeButton;
    private JButton findNodeWithGivenButton;
    private JButton findNodeWithMinButton;
    private JButton findNodeWithMaxButton;
    private JButton heighOfTreeButton;
    private JButton amOfInternalNodesButton;
    private JButton amOfExternalNodesButton;
    private JButton amOfLeafsButton;
    private JButton displayByLevelsButton;
    private JButton displayInOrderButton;
    private JButton displayPreOrderButton;
    private JButton displayPostOrderButton;
    private JButton findNextNodeAfterButton;
    private JButton findNodeBeforeButton;
    private JTextField NextNode;
    private JTextField BeforeNode;
    private JTextField FindNode;
    private JTextField AddNode;
    private JTextField DeleteNode;
    private JTextArea text;
    private JButton clearButton;
    private JButton infosButton;
    private JPanel RootPanel;

    public window() {

        super("BST");

        // 5 2 7 1 4 6 12 3 9 8
        // 4 2 8 1 3 6 10 5 7 9 11 12



        addNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int key,l;
                String[] a = AddNode.getText().split(" ");
                l = a.length;

                try{

                    for(int i = 0; i < l; i++){

                        key = Integer.parseInt(a[i]);
                        bst.addNode(key);

                    }

                    //key = Integer.parseInt(AddNode.getText());
                   // bst.addNode(key);
                    AddNode.setText("");

                }

                catch(Exception q){
                    q.printStackTrace();
                    AddNode.setText("Wrong key number");

                }

            }
        });
        deleteNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int key;

                try{
                    key = Integer.parseInt(DeleteNode.getText());
                    BST.Node node = bst.findNode(key);

                    if(node != null){
                        bst.DeleteNode(node);
                    }
                    DeleteNode.setText("");

                }

                catch(Exception a){
                    a.printStackTrace();
                    DeleteNode.setText("Wrong key number");

                }

            }
        });
        displayByLevelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.DisplayByLevels(text);
            }
        });
        displayInOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.inOrder(text);
            }
        });
        displayPreOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.preOrder(text);
            }
        });
        displayPostOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.postOrder(text);
            }
        });
        findNodeWithGivenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int key;

                try{
                    key = Integer.parseInt(FindNode.getText());
                    bst.findNode(key, text);
                    FindNode.setText("");

                }

                catch(Exception a){
                    FindNode.setText("Wrong key number");

                }
            }
        });
        findNodeWithMinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.MIN(text);
            }
        });
        findNodeWithMaxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.MAX(text);
            }
        });
        heighOfTreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.heigh(text);
            }
        });
        amOfInternalNodesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.InternalNodes(text);
            }
        });
        amOfExternalNodesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.ExternalNodes(text);
            }
        });
        amOfLeafsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.Leafs(text);
            }
        });
        findNextNodeAfterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int key;
                BST.Node node;

                try{
                    key = Integer.parseInt(NextNode.getText());
                    node = bst.findNode(key);
                    bst.ElemNext(node,text);
                    NextNode.setText("");
                }

                catch(Exception a){
                    NextNode.setText("Wrong key number");

                }

            }
        });
        findNodeBeforeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int key;
                BST.Node node;

                try{
                    key = Integer.parseInt(BeforeNode.getText());
                    node = bst.findNode(key);
                    bst.ElemBefore(node,text);
                    BeforeNode.setText("");
                }

                catch(Exception a){
                    BeforeNode.setText("Wrong key number");

                }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        infosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame2 = new JFrame("Informations");
                frame2.setSize(500,150);
                frame2.setLocation(300,300);
                frame2.setLayout(new GridBagLayout());
                JLabel label = new JLabel("Program made by \n\nIgor Czeczot   ");
                JLabel label2 = new JLabel("Test Binary search tree with integer values");
                frame2.add(label);
                frame2.add(label2);
                frame2.setVisible(true);

            }
        });
        displayTreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bst.DisplayTree(text);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("BST");
        frame.setContentPane(new window().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
