public class LoopChecker implements Checker{
    private static final String VALID_CHARACTERS = "0123456789_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Override
    public void check(String s, boolean login) throws WrongPasswordException, WrongLoginException {
        for (int i = 0; i <s.length() ; i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                if (login) {
                    throw new WrongLoginException("Логин должен содержать символы латинские, цифры или знак подчеркивания");
                } else {
                    throw new WrongPasswordException("Пароль должен содержать символы латинские, цифры или знак подчеркивания");
                }
            }
        }
    }
}
