public class CreditCard {

    public void payWithDebitCard()
    {
        DebitCard d=new DebitCard();
        d.pay();
    }

    public void payWithNetBanking()
    {
        NetBanking netBanking=new NetBanking();
        netBanking.pay();
    }

    public void payWithUpi()
    {
        Upi upi=new Upi();
        upi.pay();
    }

    public void payWithPaytm()
    {
        Paytm paytm=new Paytm();
        paytm.pay();
    }
}
