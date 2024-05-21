import java.sql.SQLException;

public class MainDAO {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public static void main(String[] args) {
        MainDAO m = new MainDAO();
        m.setPersonDAO(new MySQLPersonDAO());
        Person person = new Person("Ahmad Douglas", 30);
        try {
            m.personDAO.savePerson(person);
            System.out.println("Person saved successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
