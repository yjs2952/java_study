package ch01;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            setTicket(ticket);
            return ticket.getFee();
        }
    }
}
