package TicTacToeLLD.Types;

public class Type{

    private TypeMoves typeMoves;

    public Type(TypeMoves typeMoves){
        this.typeMoves = typeMoves;
    }

    public TypeMoves getMoveType(){
        return this.typeMoves;
    }

    public void setTypeMoves(TypeMoves typeMoves){
        this.typeMoves = typeMoves;
    }

}