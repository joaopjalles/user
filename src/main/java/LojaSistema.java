public class LojaSistema {
    public static void main(String[] args) {

        Role adminRole = new Role("Admin");
        Role caixaRole = new Role("Caixa");
        Role clienteRole = new Role("Cliente");

        User user1 = new User("joao123", "joao@gmail.com");
        User user2 = new User("maria456", "maria@hotmail.com");

        user1.addRole(adminRole);
        user1.addRole(caixaRole);

        user2.addRole(clienteRole);

        System.out.println(user1);
        System.out.println(user2);

        user1.removeRole(caixaRole);
        System.out.println("Após remover o papel de Caixa do usuário 1:");
        System.out.println(user1);
    }
}