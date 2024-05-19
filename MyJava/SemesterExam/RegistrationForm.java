import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    private Frame frame;
    private TextField studentNameField, fatherNameField;
    private CheckboxGroup genderCheckboxGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Choice courseChoice;
    private Checkbox acceptCheckbox;

    public RegistrationForm() {
        frame = new Frame("University of Delhi");
        frame.setLayout(null); // Using null layout for manual positioning

        // Labels
        Label titleLabel = new Label("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBounds(150, 30, 200, 30); // Set bounds for positioning

        Label studentLabel = new Label("Student Name:");
        studentLabel.setBounds(50, 80, 100, 30);

        Label fatherLabel = new Label("Father Name:");
        fatherLabel.setBounds(50, 120, 100, 30);

        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 160, 100, 30);

        Label courseLabel = new Label("Course:");
        courseLabel.setBounds(50, 200, 100, 30);

        Label acceptLabel = new Label("Accept Terms and Conditions:");
        acceptLabel.setBounds(50, 240, 200, 30);

        // Text Fields
        studentNameField = new TextField(20);
        studentNameField.setBounds(160, 80, 150, 30);

        fatherNameField = new TextField(20);
        fatherNameField.setBounds(160, 120, 150, 30);

        // Checkbox Group for Gender
        genderCheckboxGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderCheckboxGroup, false);
        maleCheckbox.setBounds(160, 160, 60, 30);

        femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);
        femaleCheckbox.setBounds(230, 160, 80, 30);

        // Dropdown List
        courseChoice = new Choice();
        courseChoice.add("MCA");
        courseChoice.add("MSc");
        courseChoice.add("PhD");
        courseChoice.setBounds(160, 200, 150, 30);

        // Checkbox for Terms and Conditions
        acceptCheckbox = new Checkbox("Accept Terms and Conditions");
        acceptCheckbox.setBounds(250, 240, 200, 30);

        // Buttons
        Button submitButton = new Button("Submit");
        submitButton.setBounds(100, 290, 80, 30);

        Button resetButton = new Button("Reset");
        resetButton.setBounds(200, 290, 80, 30);

        // Action Listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        // Adding components to the frame
        frame.add(titleLabel);
        frame.add(studentLabel);
        frame.add(studentNameField);
        frame.add(fatherLabel);
        frame.add(fatherNameField);
        frame.add(genderLabel);
        frame.add(maleCheckbox);
        frame.add(femaleCheckbox);
        frame.add(courseLabel);
        frame.add(courseChoice);
        frame.add(acceptLabel);
        frame.add(acceptCheckbox);
        frame.add(submitButton);
        frame.add(resetButton);

        frame.setSize(400, 350);
        frame.setVisible(true);
    }

    private void submitForm() {
        String studentName = studentNameField.getText();
        String fatherName = fatherNameField.getText();
        String gender = maleCheckbox.getState() ? "Male" : "Female";
        String course = courseChoice.getSelectedItem();
        boolean acceptedTerms = acceptCheckbox.getState();

        // Here you can process the form data, e.g., show a dialog box with the information.
        String message ="Registration Successfully..";

        /*  "Student Name: " + studentName + "\nFather Name: " + fatherName +
                "\nGender: " + gender + "\nCourse: " + course + "\nAccepted Terms: " + acceptedTerms;
                */

        showMessageDialog("Registration done", message);
    }

    private void resetForm() {
        studentNameField.setText("");
        fatherNameField.setText("");
        genderCheckboxGroup.setSelectedCheckbox(null);
        courseChoice.select(0);
        acceptCheckbox.setState(false);
    }

    private void showMessageDialog(String title, String message) {
        Dialog dialog = new Dialog(frame, title, true);
        dialog.setLayout(new GridLayout(2, 1));
        Label messageLabel = new Label(message, Label.CENTER);
        Button closeButton = new Button("Close");

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });

        dialog.add(messageLabel);
        dialog.add(closeButton);

        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
