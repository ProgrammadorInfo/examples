package info.programmador.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author programmador.info
 * @since 14.07.15 0:03
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    public String generateBookId() {
        return UUID.randomUUID().toString();
    }
}
