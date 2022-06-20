package server.spaceserver.service.currentuser;


import server.spaceserver.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
