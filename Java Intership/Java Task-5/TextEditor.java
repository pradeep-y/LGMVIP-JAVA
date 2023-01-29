// import javax.swing.*;
// import javax.swing.border.EmptyBorder;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.*;

// public class TextEditor implements  ActionListener {
//     JFrame frame;
//     JMenuBar menuBar;
//     JMenu file,edit;

//     JMenuItem newFile,saveFile,openFile;
//     JMenuItem cut,copy,paste,selectAll,close;
//     JTextArea textArea;
//     private String output;

//     TextEditor()
//     {
     
//         frame=new JFrame();

//         menuBar=new JMenuBar();

   
//         file=new JMenu("File");
//         edit=new JMenu("Edit");
//         // initialise the textArea
//         textArea=new JTextArea();
      
//         newFile =new JMenuItem("New Window");
//         saveFile=new JMenuItem("Save File");
//         openFile=new JMenuItem("Open file");

//         cut=new JMenuItem("Cut");
//         copy=new JMenuItem("Copy");
//         paste=new JMenuItem("Paste");
//         selectAll=new JMenuItem("Select All");
//         close=new JMenuItem("Close Window");

//         newFile.addActionListener(this);
//         saveFile.addActionListener(this);
//         openFile.addActionListener(this);
 
//         cut.addActionListener(this);
//         copy.addActionListener(this);
//         paste.addActionListener(this);
//         selectAll.addActionListener(this);
//         close.addActionListener(this);

//         file.add(newFile);
//         file.add(saveFile);
//         file.add(openFile);

//         edit.add(cut);
//         edit.add(copy);
//         edit.add(paste);
//         edit.add(selectAll);
//         edit.add(close);

//         menuBar.add(file);
//         menuBar.add(edit);

//         frame.setJMenuBar(menuBar);

//         JPanel panel=new JPanel();
//         panel.setBorder(new EmptyBorder(10,10,20,10));
//         panel.setLayout(new BorderLayout(0,0));

//         panel.add(textArea,BorderLayout.CENTER);

//         JScrollPane scrollPane=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

//         panel.add(scrollPane);

//         frame.add(panel);

//         frame.setBounds(200,100,700,500);

//         frame.setVisible(true);


//     }

//     @Override
//     public void actionPerformed(ActionEvent actionEvent){
//         // if cut menu action is clicked
//         if(actionEvent.getSource()==cut){
//                 textArea.cut();
//         }

//         if(actionEvent.getSource()==copy){
//                 textArea.copy();
//         }

//         if(actionEvent.getSource()==paste){
//                 textArea.paste();
//         }
      
//         if(actionEvent.getSource()==selectAll){
//                 textArea.selectAll();
//         }
 
//         if(actionEvent.getSource()==close){
//                 System.exit(0);
//         }
   
//         if(actionEvent.getSource()==newFile){
//         }
     
//         if(actionEvent.getSource()==openFile){
    
//             JFileChooser fileChooser=new JFileChooser("F:");

//             int chooseOption=fileChooser.showOpenDialog(null);
//             // if choose option is the approve option
//             if(chooseOption==JFileChooser.APPROVE_OPTION)
//             {
  
//                 File file=fileChooser.getSelectedFile();
//                 //getting path of the selected file
//                 String filePath=file.getPath();
//                 try{
        
//                     FileReader fileReader=new FileReader(filePath);
//                     try (//initialise the buffer reader
//                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//                         //intemediate for current line ; output for complete content of file
//                         String intermediate="";
//                         //read line by line
//                         while((intermediate=bufferedReader.readLine())!=null)
//                         {
//                             output+=intermediate+"\n";

//                         }
//                     }
     
//                     textArea.setText(output);
//                 }
//                 catch (Exception exception){
//                     exception.printStackTrace();
//                 }
//             }

//         }
      
//         if(actionEvent.getSource()==saveFile){
//             // initialise file chooser
//             JFileChooser fileChooser=new JFileChooser("F:");

//             int chooseOption =fileChooser.showSaveDialog(null);

//             if(chooseOption==JFileChooser.APPROVE_OPTION){
//                 File file=new File(fileChooser.getSelectedFile().getAbsolutePath()+".txt");
//                 try{
        
//                     BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
//                     textArea.write(bufferedWriter);
//                     bufferedWriter.close();


//                 }
//                 catch (Exception exception){
//                     exception.printStackTrace();
//                 }
//             }

//         }


//     }
//     public static void main(String[] args) {
//             new TextEditor();

//     }
// }