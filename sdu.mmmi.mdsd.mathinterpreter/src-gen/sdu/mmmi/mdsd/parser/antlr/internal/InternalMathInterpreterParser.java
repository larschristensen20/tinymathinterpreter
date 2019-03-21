package sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sdu.mmmi.mdsd.services.MathInterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpreterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exp'", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathInterpreterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathInterpreterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathInterpreterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathInterpreter.g"; }



     	private MathInterpreterGrammarAccess grammarAccess;

        public InternalMathInterpreterParser(TokenStream input, MathInterpreterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathInterpreterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathInterpreter.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathInterpreter.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathInterpreter.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathInterpreter.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'exp' ( (lv_exp_1_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:77:2: ( (otherlv_0= 'exp' ( (lv_exp_1_0= ruleExp ) ) ) )
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'exp' ( (lv_exp_1_0= ruleExp ) ) )
            {
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'exp' ( (lv_exp_1_0= ruleExp ) ) )
            // InternalMathInterpreter.g:79:3: otherlv_0= 'exp' ( (lv_exp_1_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getExpKeyword_0());
            		
            // InternalMathInterpreter.g:83:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMathInterpreter.g:84:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMathInterpreter.g:84:4: (lv_exp_1_0= ruleExp )
            // InternalMathInterpreter.g:85:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"sdu.mmmi.mdsd.MathInterpreter.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathInterpreter.g:106:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathInterpreter.g:106:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathInterpreter.g:107:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathInterpreter.g:113:1: ruleExp returns [EObject current=null] : this_PlusOrMinus_0= rulePlusOrMinus ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOrMinus_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:119:2: (this_PlusOrMinus_0= rulePlusOrMinus )
            // InternalMathInterpreter.g:120:2: this_PlusOrMinus_0= rulePlusOrMinus
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            		current = this_PlusOrMinus_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleAtomic"
    // InternalMathInterpreter.g:131:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMathInterpreter.g:131:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMathInterpreter.g:132:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMathInterpreter.g:138:1: ruleAtomic returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:144:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathInterpreter.g:145:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathInterpreter.g:145:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathInterpreter.g:146:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMathInterpreter.g:146:3: ()
            // InternalMathInterpreter.g:147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalMathInterpreter.g:153:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathInterpreter.g:154:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathInterpreter.g:154:4: (lv_value_1_0= RULE_INT )
            // InternalMathInterpreter.g:155:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpreter.g:175:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathInterpreter.g:175:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathInterpreter.g:176:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpreter.g:182:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;

        EObject this_Atomic_3 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:188:2: ( ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) | this_Atomic_3= ruleAtomic ) )
            // InternalMathInterpreter.g:189:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) | this_Atomic_3= ruleAtomic )
            {
            // InternalMathInterpreter.g:189:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) | this_Atomic_3= ruleAtomic )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMathInterpreter.g:190:3: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
                    {
                    // InternalMathInterpreter.g:190:3: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
                    // InternalMathInterpreter.g:191:4: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_Exp_1=ruleExp();

                    state._fsp--;


                    				current = this_Exp_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:209:3: this_Atomic_3= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_3=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMathInterpreter.g:221:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMathInterpreter.g:221:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMathInterpreter.g:222:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMathInterpreter.g:228:1: rulePlusOrMinus returns [EObject current=null] : (this_MultOrDiv_0= ruleMultOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_MultOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:234:2: ( (this_MultOrDiv_0= ruleMultOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) ) )* ) )
            // InternalMathInterpreter.g:235:2: (this_MultOrDiv_0= ruleMultOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) ) )* )
            {
            // InternalMathInterpreter.g:235:2: (this_MultOrDiv_0= ruleMultOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) ) )* )
            // InternalMathInterpreter.g:236:3: this_MultOrDiv_0= ruleMultOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMultOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_MultOrDiv_0=ruleMultOrDiv();

            state._fsp--;


            			current = this_MultOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpreter.g:244:3: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathInterpreter.g:245:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultOrDiv ) )
            	    {
            	    // InternalMathInterpreter.g:245:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==15) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMathInterpreter.g:246:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            {
            	            // InternalMathInterpreter.g:246:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            // InternalMathInterpreter.g:247:6: () ( (lv_op_2_0= '+' ) )
            	            {
            	            // InternalMathInterpreter.g:247:6: ()
            	            // InternalMathInterpreter.g:248:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            // InternalMathInterpreter.g:254:6: ( (lv_op_2_0= '+' ) )
            	            // InternalMathInterpreter.g:255:7: (lv_op_2_0= '+' )
            	            {
            	            // InternalMathInterpreter.g:255:7: (lv_op_2_0= '+' )
            	            // InternalMathInterpreter.g:256:8: lv_op_2_0= '+'
            	            {
            	            lv_op_2_0=(Token)match(input,14,FOLLOW_3); 

            	            								newLeafNode(lv_op_2_0, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_0, "+");
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathInterpreter.g:270:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            {
            	            // InternalMathInterpreter.g:270:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            // InternalMathInterpreter.g:271:6: () ( (lv_op_4_0= '-' ) )
            	            {
            	            // InternalMathInterpreter.g:271:6: ()
            	            // InternalMathInterpreter.g:272:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            // InternalMathInterpreter.g:278:6: ( (lv_op_4_0= '-' ) )
            	            // InternalMathInterpreter.g:279:7: (lv_op_4_0= '-' )
            	            {
            	            // InternalMathInterpreter.g:279:7: (lv_op_4_0= '-' )
            	            // InternalMathInterpreter.g:280:8: lv_op_4_0= '-'
            	            {
            	            lv_op_4_0=(Token)match(input,15,FOLLOW_3); 

            	            								newLeafNode(lv_op_4_0, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_4_0, "-");
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathInterpreter.g:294:4: ( (lv_right_5_0= ruleMultOrDiv ) )
            	    // InternalMathInterpreter.g:295:5: (lv_right_5_0= ruleMultOrDiv )
            	    {
            	    // InternalMathInterpreter.g:295:5: (lv_right_5_0= ruleMultOrDiv )
            	    // InternalMathInterpreter.g:296:6: lv_right_5_0= ruleMultOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_5_0=ruleMultOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"sdu.mmmi.mdsd.MathInterpreter.MultOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMultOrDiv"
    // InternalMathInterpreter.g:318:1: entryRuleMultOrDiv returns [EObject current=null] : iv_ruleMultOrDiv= ruleMultOrDiv EOF ;
    public final EObject entryRuleMultOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDiv = null;


        try {
            // InternalMathInterpreter.g:318:50: (iv_ruleMultOrDiv= ruleMultOrDiv EOF )
            // InternalMathInterpreter.g:319:2: iv_ruleMultOrDiv= ruleMultOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMultOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultOrDiv=ruleMultOrDiv();

            state._fsp--;

             current =iv_ruleMultOrDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultOrDiv"


    // $ANTLR start "ruleMultOrDiv"
    // InternalMathInterpreter.g:325:1: ruleMultOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:331:2: ( (this_Primary_0= rulePrimary ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathInterpreter.g:332:2: (this_Primary_0= rulePrimary ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathInterpreter.g:332:2: (this_Primary_0= rulePrimary ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathInterpreter.g:333:3: this_Primary_0= rulePrimary ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpreter.g:341:3: ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathInterpreter.g:342:4: ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathInterpreter.g:342:4: ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==17) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMathInterpreter.g:343:5: ( () ( (lv_op_2_0= '*' ) ) )
            	            {
            	            // InternalMathInterpreter.g:343:5: ( () ( (lv_op_2_0= '*' ) ) )
            	            // InternalMathInterpreter.g:344:6: () ( (lv_op_2_0= '*' ) )
            	            {
            	            // InternalMathInterpreter.g:344:6: ()
            	            // InternalMathInterpreter.g:345:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultOrDivAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            // InternalMathInterpreter.g:351:6: ( (lv_op_2_0= '*' ) )
            	            // InternalMathInterpreter.g:352:7: (lv_op_2_0= '*' )
            	            {
            	            // InternalMathInterpreter.g:352:7: (lv_op_2_0= '*' )
            	            // InternalMathInterpreter.g:353:8: lv_op_2_0= '*'
            	            {
            	            lv_op_2_0=(Token)match(input,16,FOLLOW_3); 

            	            								newLeafNode(lv_op_2_0, grammarAccess.getMultOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMultOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_0, "*");
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathInterpreter.g:367:5: ( () ( (lv_op_4_0= '/' ) ) )
            	            {
            	            // InternalMathInterpreter.g:367:5: ( () ( (lv_op_4_0= '/' ) ) )
            	            // InternalMathInterpreter.g:368:6: () ( (lv_op_4_0= '/' ) )
            	            {
            	            // InternalMathInterpreter.g:368:6: ()
            	            // InternalMathInterpreter.g:369:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultOrDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            // InternalMathInterpreter.g:375:6: ( (lv_op_4_0= '/' ) )
            	            // InternalMathInterpreter.g:376:7: (lv_op_4_0= '/' )
            	            {
            	            // InternalMathInterpreter.g:376:7: (lv_op_4_0= '/' )
            	            // InternalMathInterpreter.g:377:8: lv_op_4_0= '/'
            	            {
            	            lv_op_4_0=(Token)match(input,17,FOLLOW_3); 

            	            								newLeafNode(lv_op_4_0, grammarAccess.getMultOrDivAccess().getOpSolidusKeyword_1_0_1_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMultOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_4_0, "/");
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathInterpreter.g:391:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathInterpreter.g:392:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathInterpreter.g:392:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathInterpreter.g:393:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"sdu.mmmi.mdsd.MathInterpreter.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultOrDiv"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030002L});

}