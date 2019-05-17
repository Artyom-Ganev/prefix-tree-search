package ru.ganev.prefix_tree_search.repository;

import org.springframework.stereotype.Repository;
import ru.ganev.prefix_tree_search.model.Word;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class WordRepository {

    private EntityManager em;

    public List<Word> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Word> cq = cb.createQuery(Word.class);
        return em.createQuery(cq).getResultList();
    }

    public List<Word> findWordsByStatusAndName(String name, String status) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Word> cq = cb.createQuery(Word.class);
        Root<Word> book = cq.from(Word.class);
        Predicate namePredicate = cb.equal(book.get("name"), name);
        Predicate statusPredicate = cb.equal(book.get("status"), status);
        cq.where(namePredicate, statusPredicate);

        TypedQuery<Word> query = em.createQuery(cq);
        return query.getResultList();
    }

}
