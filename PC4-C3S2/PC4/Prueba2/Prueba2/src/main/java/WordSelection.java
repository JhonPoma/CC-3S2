public class WordSelection {
    private final WordRepository repository;

    public WordSelection(WordRepository repository) {
        this.repository = repository;
    }

    /**
     * Obtenemos una palabra aleatoria del Repositorio.
     *
     * @return la palabra aleatoria obtenida del repositorio.
     * @throws WordSelectionException si ocurre un error al obtener la palabra del repositorio.
     */
    public String getRandomWord() throws WordSelectionException {
        int randomWordNumber = getRandomNumber();
        try {
            return repository.fetchWordByNumber(randomWordNumber);
        } catch (WordRepositoryException e) {
            throw new WordSelectionException("Error al obtener la palabra del repositorio", e);
        }

    }
    private int getRandomNumber() {
        return 1;//deberia generar un aleatorio, le paso un 1.
    }


}
