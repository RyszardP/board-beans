package org.example.repository;

import java.util.Date;

public class Board {

    private String boardId;
    private String boardTitle;
    private String uniqueVisitorId;
    private String partId;
    private Date dateCreate;
    private Date dateViewByUser;

    public Board() {
    }

    public Board(String boardId, String boardTitle, String uniqueVisitorId, String partId, Date dateCreate,
                 Date dateViewByUser) {
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.uniqueVisitorId = uniqueVisitorId;
        this.partId = partId;
        this.dateCreate = dateCreate;
        this.dateViewByUser = dateViewByUser;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getUniqueVisitorId() {
        return uniqueVisitorId;
    }

    public void setUniqueVisitorId(String uniqueVisitorId) {
        this.uniqueVisitorId = uniqueVisitorId;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateViewByUser() {
        return dateViewByUser;
    }

    public void setDateViewByUser(Date dateViewByUser) {
        this.dateViewByUser = dateViewByUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (!boardId.equals(board.boardId)) return false;
        if (!boardTitle.equals(board.boardTitle)) return false;
        if (!uniqueVisitorId.equals(board.uniqueVisitorId)) return false;
        if (!partId.equals(board.partId)) return false;
        if (!dateCreate.equals(board.dateCreate)) return false;
        return dateViewByUser.equals(board.dateViewByUser);
    }

    @Override
    public int hashCode() {
        int result = boardId.hashCode();
        result = 31 * result + boardTitle.hashCode();
        result = 31 * result + uniqueVisitorId.hashCode();
        result = 31 * result + partId.hashCode();
        result = 31 * result + dateCreate.hashCode();
        result = 31 * result + dateViewByUser.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId='" + boardId + '\'' +
                ", boardTitle='" + boardTitle + '\'' +
                ", uniqueVisitorId='" + uniqueVisitorId + '\'' +
                ", partId='" + partId + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateViewByUser=" + dateViewByUser +
                '}';
    }
}
