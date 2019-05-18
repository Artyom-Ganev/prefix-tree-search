package ru.ganev.prefix_tree_search.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.ganev.prefix_tree_search.model.Word;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Optional;

@Repository
public class WordRepository implements CrudRepository<Word, Long> {
    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public <S extends Word> S save(S s) {
        return null;
    }

    @Override
    @Transactional
    public <S extends Word> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Word> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Word> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Word> cr = cb.createQuery(Word.class);
        Root<Word> root = cr.from(Word.class);
        cr.select(root);
        TypedQuery<Word> query = em.createQuery(cr);
        return query.getResultList();
    }

    @Override
    public Iterable<Word> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Word word) {

    }

    @Override
    public void deleteAll(Iterable<? extends Word> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
