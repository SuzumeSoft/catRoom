package jp.sakura.server.catroom;

import jp.sakura.server.catroom.Entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RexiA7 on 2017/06/18.
 */
public interface ICommentRepository extends JpaRepository<MessageEntity, Integer> {
}
