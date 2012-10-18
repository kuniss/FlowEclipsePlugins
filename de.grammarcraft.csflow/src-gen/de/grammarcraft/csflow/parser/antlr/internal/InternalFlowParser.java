package de.grammarcraft.csflow.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.grammarcraft.csflow.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'import'", "'flow'", "'>'", "';'", "'in'", "'out'", "'ebc'", "'='", "'operation'", "'method'", "'#'", "'as'", "'Action'", "'Func'", "'<'", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFlowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowParser.tokenNames; }
    public String getGrammarFileName() { return "../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g"; }



     	private FlowGrammarAccess grammarAccess;
     	
        public InternalFlowParser(TokenStream input, FlowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FlowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:76:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_functionUnits_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:79:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )*
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel123); 

                        	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0_0());
                        
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:86:3: lv_name_1_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel144);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:102:4: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel167);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:120:3: ( (lv_functionUnits_3_0= ruleFunctionUnit ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==19||(LA3_0>=21 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:121:1: (lv_functionUnits_3_0= ruleFunctionUnit )
            	    {
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:121:1: (lv_functionUnits_3_0= ruleFunctionUnit )
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:122:3: lv_functionUnits_3_0= ruleFunctionUnit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionUnit_in_ruleModel189);
            	    lv_functionUnits_3_0=ruleFunctionUnit();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functionUnits",
            	            		lv_functionUnits_3_0, 
            	            		"FunctionUnit");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:146:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:147:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:148:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName227);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName238); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:155:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:158:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:159:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:159:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:159:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName278); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:166:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:167:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName297); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName312); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFunctionUnit"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:187:1: entryRuleFunctionUnit returns [EObject current=null] : iv_ruleFunctionUnit= ruleFunctionUnit EOF ;
    public final EObject entryRuleFunctionUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUnit = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:188:2: (iv_ruleFunctionUnit= ruleFunctionUnit EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:189:2: iv_ruleFunctionUnit= ruleFunctionUnit EOF
            {
             newCompositeNode(grammarAccess.getFunctionUnitRule()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit359);
            iv_ruleFunctionUnit=ruleFunctionUnit();

            state._fsp--;

             current =iv_ruleFunctionUnit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUnit369); 

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
    // $ANTLR end "entryRuleFunctionUnit"


    // $ANTLR start "ruleFunctionUnit"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:196:1: ruleFunctionUnit returns [EObject current=null] : (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFunctionUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Flow_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:199:28: ( (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:200:1: (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:200:1: (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==19||(LA5_0>=21 && LA5_0<=22)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:201:5: this_Flow_0= ruleFlow
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFlow_in_ruleFunctionUnit416);
                    this_Flow_0=ruleFlow();

                    state._fsp--;

                     
                            current = this_Flow_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:211:5: this_Operation_1= ruleOperation
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperation_in_ruleFunctionUnit443);
                    this_Operation_1=ruleOperation();

                    state._fsp--;

                     
                            current = this_Operation_1; 
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
    // $ANTLR end "ruleFunctionUnit"


    // $ANTLR start "entryRuleImport"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:227:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:228:2: (iv_ruleImport= ruleImport EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:229:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport478);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport488); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:236:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:239:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:240:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:240:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:240:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport525); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:244:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:245:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:245:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:246:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport546);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFlow"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:270:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:271:2: (iv_ruleFlow= ruleFlow EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:272:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow582);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow592); 

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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:279:1: ruleFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_streams_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:282:28: ( (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:283:1: (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:283:1: (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:283:3: otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFlow629); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getFlowKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:288:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:288:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlow646); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFlowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:305:2: ( (lv_streams_2_0= ruleStream ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:306:1: (lv_streams_2_0= ruleStream )
            	    {
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:306:1: (lv_streams_2_0= ruleStream )
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:307:3: lv_streams_2_0= ruleStream
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStream_in_ruleFlow672);
            	    lv_streams_2_0=ruleStream();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"streams",
            	            		lv_streams_2_0, 
            	            		"Stream");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleStream"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:331:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:332:2: (iv_ruleStream= ruleStream EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:333:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream709);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream719); 

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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:340:1: ruleStream returns [EObject current=null] : ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleQualifiedName ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_leftPort_0_0 = null;

        AntlrDatatypeRuleToken lv_message_2_0 = null;

        EObject lv_rightPort_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:343:28: ( ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleQualifiedName ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:344:1: ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleQualifiedName ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:344:1: ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleQualifiedName ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:344:2: ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleQualifiedName ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';'
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:344:2: ( (lv_leftPort_0_0= ruleLeftPort ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:345:1: (lv_leftPort_0_0= ruleLeftPort )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:345:1: (lv_leftPort_0_0= ruleLeftPort )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:346:3: lv_leftPort_0_0= ruleLeftPort
            {
             
            	        newCompositeNode(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLeftPort_in_ruleStream765);
            lv_leftPort_0_0=ruleLeftPort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamRule());
            	        }
                   		set(
                   			current, 
                   			"leftPort",
                    		lv_leftPort_0_0, 
                    		"LeftPort");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleStream777); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:366:1: ( (lv_message_2_0= ruleQualifiedName ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:367:1: (lv_message_2_0= ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:367:1: (lv_message_2_0= ruleQualifiedName )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:368:3: lv_message_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStream798);
            lv_message_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamRule());
            	        }
                   		set(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStream810); 

                	newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:388:1: ( (lv_rightPort_4_0= ruleRightPort ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:389:1: (lv_rightPort_4_0= ruleRightPort )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:389:1: (lv_rightPort_4_0= ruleRightPort )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:390:3: lv_rightPort_4_0= ruleRightPort
            {
             
            	        newCompositeNode(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleRightPort_in_ruleStream831);
            lv_rightPort_4_0=ruleRightPort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamRule());
            	        }
                   		set(
                   			current, 
                   			"rightPort",
                    		lv_rightPort_4_0, 
                    		"RightPort");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleStream843); 

                	newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleLeftPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:418:1: entryRuleLeftPort returns [EObject current=null] : iv_ruleLeftPort= ruleLeftPort EOF ;
    public final EObject entryRuleLeftPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:419:2: (iv_ruleLeftPort= ruleLeftPort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:420:2: iv_ruleLeftPort= ruleLeftPort EOF
            {
             newCompositeNode(grammarAccess.getLeftPortRule()); 
            pushFollow(FOLLOW_ruleLeftPort_in_entryRuleLeftPort879);
            iv_ruleLeftPort=ruleLeftPort();

            state._fsp--;

             current =iv_ruleLeftPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPort889); 

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
    // $ANTLR end "entryRuleLeftPort"


    // $ANTLR start "ruleLeftPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:427:1: ruleLeftPort returns [EObject current=null] : (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) ;
    public final EObject ruleLeftPort() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalInputPort_0 = null;

        EObject this_UnnamedSubFlowPort_1 = null;

        EObject this_Port_2 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:430:28: ( (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:431:1: (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:431:1: (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==15) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:432:5: this_GlobalInputPort_0= ruleGlobalInputPort
                    {
                     
                            newCompositeNode(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGlobalInputPort_in_ruleLeftPort936);
                    this_GlobalInputPort_0=ruleGlobalInputPort();

                    state._fsp--;

                     
                            current = this_GlobalInputPort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:442:5: this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort
                    {
                     
                            newCompositeNode(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_ruleLeftPort963);
                    this_UnnamedSubFlowPort_1=ruleUnnamedSubFlowPort();

                    state._fsp--;

                     
                            current = this_UnnamedSubFlowPort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:452:5: this_Port_2= rulePort
                    {
                     
                            newCompositeNode(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePort_in_ruleLeftPort990);
                    this_Port_2=rulePort();

                    state._fsp--;

                     
                            current = this_Port_2; 
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
    // $ANTLR end "ruleLeftPort"


    // $ANTLR start "entryRuleGlobalInputPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:468:1: entryRuleGlobalInputPort returns [EObject current=null] : iv_ruleGlobalInputPort= ruleGlobalInputPort EOF ;
    public final EObject entryRuleGlobalInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalInputPort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:469:2: (iv_ruleGlobalInputPort= ruleGlobalInputPort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:470:2: iv_ruleGlobalInputPort= ruleGlobalInputPort EOF
            {
             newCompositeNode(grammarAccess.getGlobalInputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort1025);
            iv_ruleGlobalInputPort=ruleGlobalInputPort();

            state._fsp--;

             current =iv_ruleGlobalInputPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInputPort1035); 

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
    // $ANTLR end "entryRuleGlobalInputPort"


    // $ANTLR start "ruleGlobalInputPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:477:1: ruleGlobalInputPort returns [EObject current=null] : (otherlv_0= '.' otherlv_1= 'in' () ) ;
    public final EObject ruleGlobalInputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:480:28: ( (otherlv_0= '.' otherlv_1= 'in' () ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:481:1: (otherlv_0= '.' otherlv_1= 'in' () )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:481:1: (otherlv_0= '.' otherlv_1= 'in' () )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:481:3: otherlv_0= '.' otherlv_1= 'in' ()
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleGlobalInputPort1072); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGlobalInputPort1084); 

                	newLeafNode(otherlv_1, grammarAccess.getGlobalInputPortAccess().getInKeyword_1());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:489:1: ()
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:490:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2(),
                        current);
                

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
    // $ANTLR end "ruleGlobalInputPort"


    // $ANTLR start "entryRuleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:503:1: entryRuleUnnamedSubFlowPort returns [EObject current=null] : iv_ruleUnnamedSubFlowPort= ruleUnnamedSubFlowPort EOF ;
    public final EObject entryRuleUnnamedSubFlowPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedSubFlowPort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:504:2: (iv_ruleUnnamedSubFlowPort= ruleUnnamedSubFlowPort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:505:2: iv_ruleUnnamedSubFlowPort= ruleUnnamedSubFlowPort EOF
            {
             newCompositeNode(grammarAccess.getUnnamedSubFlowPortRule()); 
            pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort1129);
            iv_ruleUnnamedSubFlowPort=ruleUnnamedSubFlowPort();

            state._fsp--;

             current =iv_ruleUnnamedSubFlowPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort1139); 

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
    // $ANTLR end "entryRuleUnnamedSubFlowPort"


    // $ANTLR start "ruleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:512:1: ruleUnnamedSubFlowPort returns [EObject current=null] : (otherlv_0= '.' () ) ;
    public final EObject ruleUnnamedSubFlowPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:515:28: ( (otherlv_0= '.' () ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:516:1: (otherlv_0= '.' () )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:516:1: (otherlv_0= '.' () )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:516:3: otherlv_0= '.' ()
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleUnnamedSubFlowPort1176); 

                	newLeafNode(otherlv_0, grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:520:1: ()
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:521:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1(),
                        current);
                

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
    // $ANTLR end "ruleUnnamedSubFlowPort"


    // $ANTLR start "entryRuleRightPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:534:1: entryRuleRightPort returns [EObject current=null] : iv_ruleRightPort= ruleRightPort EOF ;
    public final EObject entryRuleRightPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightPort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:535:2: (iv_ruleRightPort= ruleRightPort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:536:2: iv_ruleRightPort= ruleRightPort EOF
            {
             newCompositeNode(grammarAccess.getRightPortRule()); 
            pushFollow(FOLLOW_ruleRightPort_in_entryRuleRightPort1221);
            iv_ruleRightPort=ruleRightPort();

            state._fsp--;

             current =iv_ruleRightPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPort1231); 

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
    // $ANTLR end "entryRuleRightPort"


    // $ANTLR start "ruleRightPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:543:1: ruleRightPort returns [EObject current=null] : (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) ;
    public final EObject ruleRightPort() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalOutputPort_0 = null;

        EObject this_UnnamedSubFlowPort_1 = null;

        EObject this_Port_2 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:546:28: ( (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:547:1: (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:547:1: (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==16) ) {
                    alt8=2;
                }
                else if ( (LA8_1==18) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:548:5: this_GlobalOutputPort_0= ruleGlobalOutputPort
                    {
                     
                            newCompositeNode(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGlobalOutputPort_in_ruleRightPort1278);
                    this_GlobalOutputPort_0=ruleGlobalOutputPort();

                    state._fsp--;

                     
                            current = this_GlobalOutputPort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:558:5: this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort
                    {
                     
                            newCompositeNode(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_ruleRightPort1305);
                    this_UnnamedSubFlowPort_1=ruleUnnamedSubFlowPort();

                    state._fsp--;

                     
                            current = this_UnnamedSubFlowPort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:568:5: this_Port_2= rulePort
                    {
                     
                            newCompositeNode(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePort_in_ruleRightPort1332);
                    this_Port_2=rulePort();

                    state._fsp--;

                     
                            current = this_Port_2; 
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
    // $ANTLR end "ruleRightPort"


    // $ANTLR start "entryRuleGlobalOutputPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:584:1: entryRuleGlobalOutputPort returns [EObject current=null] : iv_ruleGlobalOutputPort= ruleGlobalOutputPort EOF ;
    public final EObject entryRuleGlobalOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalOutputPort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:585:2: (iv_ruleGlobalOutputPort= ruleGlobalOutputPort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:586:2: iv_ruleGlobalOutputPort= ruleGlobalOutputPort EOF
            {
             newCompositeNode(grammarAccess.getGlobalOutputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort1367);
            iv_ruleGlobalOutputPort=ruleGlobalOutputPort();

            state._fsp--;

             current =iv_ruleGlobalOutputPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalOutputPort1377); 

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
    // $ANTLR end "entryRuleGlobalOutputPort"


    // $ANTLR start "ruleGlobalOutputPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:593:1: ruleGlobalOutputPort returns [EObject current=null] : (otherlv_0= '.' otherlv_1= 'out' () ) ;
    public final EObject ruleGlobalOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:596:28: ( (otherlv_0= '.' otherlv_1= 'out' () ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:597:1: (otherlv_0= '.' otherlv_1= 'out' () )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:597:1: (otherlv_0= '.' otherlv_1= 'out' () )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:597:3: otherlv_0= '.' otherlv_1= 'out' ()
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleGlobalOutputPort1414); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGlobalOutputPort1426); 

                	newLeafNode(otherlv_1, grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:605:1: ()
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:606:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2(),
                        current);
                

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
    // $ANTLR end "ruleGlobalOutputPort"


    // $ANTLR start "entryRulePort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:619:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:620:2: (iv_rulePort= rulePort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:621:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1471);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1481); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:628:1: rulePort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_port_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:631:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:632:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:632:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:632:2: ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )?
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:632:2: ( (otherlv_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:633:1: (otherlv_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:633:1: (otherlv_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:634:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1526); 

            		newLeafNode(otherlv_0, grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 
            	

            }


            }

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:645:2: ( (lv_port_1_0= ruleNamedPort ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:646:1: (lv_port_1_0= ruleNamedPort )
                    {
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:646:1: (lv_port_1_0= ruleNamedPort )
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:647:3: lv_port_1_0= ruleNamedPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedPort_in_rulePort1547);
                    lv_port_1_0=ruleNamedPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPortRule());
                    	        }
                           		set(
                           			current, 
                           			"port",
                            		lv_port_1_0, 
                            		"NamedPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleNamedPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:671:1: entryRuleNamedPort returns [EObject current=null] : iv_ruleNamedPort= ruleNamedPort EOF ;
    public final EObject entryRuleNamedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedPort = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:672:2: (iv_ruleNamedPort= ruleNamedPort EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:673:2: iv_ruleNamedPort= ruleNamedPort EOF
            {
             newCompositeNode(grammarAccess.getNamedPortRule()); 
            pushFollow(FOLLOW_ruleNamedPort_in_entryRuleNamedPort1584);
            iv_ruleNamedPort=ruleNamedPort();

            state._fsp--;

             current =iv_ruleNamedPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPort1594); 

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
    // $ANTLR end "entryRuleNamedPort"


    // $ANTLR start "ruleNamedPort"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:680:1: ruleNamedPort returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNamedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:683:28: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:684:1: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:684:1: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:684:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNamedPort1631); 

                	newLeafNode(otherlv_0, grammarAccess.getNamedPortAccess().getFullStopKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:688:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:689:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:689:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:690:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedPort1648); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleNamedPort"


    // $ANTLR start "entryRuleOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:714:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:715:2: (iv_ruleOperation= ruleOperation EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:716:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1689);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1699); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:723:1: ruleOperation returns [EObject current=null] : (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation | this_ClassOperation_2= ruleClassOperation ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_EbcOperation_0 = null;

        EObject this_MethodOperation_1 = null;

        EObject this_ClassOperation_2 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:726:28: ( (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation | this_ClassOperation_2= ruleClassOperation ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:727:1: (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation | this_ClassOperation_2= ruleClassOperation )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:727:1: (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation | this_ClassOperation_2= ruleClassOperation )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:728:5: this_EbcOperation_0= ruleEbcOperation
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEbcOperation_in_ruleOperation1746);
                    this_EbcOperation_0=ruleEbcOperation();

                    state._fsp--;

                     
                            current = this_EbcOperation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:738:5: this_MethodOperation_1= ruleMethodOperation
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMethodOperation_in_ruleOperation1773);
                    this_MethodOperation_1=ruleMethodOperation();

                    state._fsp--;

                     
                            current = this_MethodOperation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:748:5: this_ClassOperation_2= ruleClassOperation
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getClassOperationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClassOperation_in_ruleOperation1800);
                    this_ClassOperation_2=ruleClassOperation();

                    state._fsp--;

                     
                            current = this_ClassOperation_2; 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEbcOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:764:1: entryRuleEbcOperation returns [EObject current=null] : iv_ruleEbcOperation= ruleEbcOperation EOF ;
    public final EObject entryRuleEbcOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEbcOperation = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:765:2: (iv_ruleEbcOperation= ruleEbcOperation EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:766:2: iv_ruleEbcOperation= ruleEbcOperation EOF
            {
             newCompositeNode(grammarAccess.getEbcOperationRule()); 
            pushFollow(FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation1835);
            iv_ruleEbcOperation=ruleEbcOperation();

            state._fsp--;

             current =iv_ruleEbcOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEbcOperation1845); 

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
    // $ANTLR end "entryRuleEbcOperation"


    // $ANTLR start "ruleEbcOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:773:1: ruleEbcOperation returns [EObject current=null] : (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) ) ;
    public final EObject ruleEbcOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_class_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:776:28: ( (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:777:1: (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:777:1: (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:777:3: otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEbcOperation1882); 

                	newLeafNode(otherlv_0, grammarAccess.getEbcOperationAccess().getEbcKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:781:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:782:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:782:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:783:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEbcOperation1899); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEbcOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEbcOperation1916); 

                	newLeafNode(otherlv_2, grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:803:1: ( (lv_class_3_0= ruleNativeClass ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:804:1: (lv_class_3_0= ruleNativeClass )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:804:1: (lv_class_3_0= ruleNativeClass )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:805:3: lv_class_3_0= ruleNativeClass
            {
             
            	        newCompositeNode(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeClass_in_ruleEbcOperation1937);
            lv_class_3_0=ruleNativeClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEbcOperationRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"NativeClass");
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
    // $ANTLR end "ruleEbcOperation"


    // $ANTLR start "entryRuleNativeClass"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:829:1: entryRuleNativeClass returns [EObject current=null] : iv_ruleNativeClass= ruleNativeClass EOF ;
    public final EObject entryRuleNativeClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeClass = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:830:2: (iv_ruleNativeClass= ruleNativeClass EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:831:2: iv_ruleNativeClass= ruleNativeClass EOF
            {
             newCompositeNode(grammarAccess.getNativeClassRule()); 
            pushFollow(FOLLOW_ruleNativeClass_in_entryRuleNativeClass1973);
            iv_ruleNativeClass=ruleNativeClass();

            state._fsp--;

             current =iv_ruleNativeClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeClass1983); 

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
    // $ANTLR end "entryRuleNativeClass"


    // $ANTLR start "ruleNativeClass"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:838:1: ruleNativeClass returns [EObject current=null] : ( (lv_reference_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleNativeClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:841:28: ( ( (lv_reference_0_0= ruleQualifiedName ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:842:1: ( (lv_reference_0_0= ruleQualifiedName ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:842:1: ( (lv_reference_0_0= ruleQualifiedName ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:843:1: (lv_reference_0_0= ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:843:1: (lv_reference_0_0= ruleQualifiedName )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:844:3: lv_reference_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNativeClass2028);
            lv_reference_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNativeClassRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNativeClass"


    // $ANTLR start "entryRuleClassOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:868:1: entryRuleClassOperation returns [EObject current=null] : iv_ruleClassOperation= ruleClassOperation EOF ;
    public final EObject entryRuleClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOperation = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:869:2: (iv_ruleClassOperation= ruleClassOperation EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:870:2: iv_ruleClassOperation= ruleClassOperation EOF
            {
             newCompositeNode(grammarAccess.getClassOperationRule()); 
            pushFollow(FOLLOW_ruleClassOperation_in_entryRuleClassOperation2063);
            iv_ruleClassOperation=ruleClassOperation();

            state._fsp--;

             current =iv_ruleClassOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOperation2073); 

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
    // $ANTLR end "entryRuleClassOperation"


    // $ANTLR start "ruleClassOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:877:1: ruleClassOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) ) ;
    public final EObject ruleClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_class_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:880:28: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:881:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:881:1: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:881:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleClassOperation2110); 

                	newLeafNode(otherlv_0, grammarAccess.getClassOperationAccess().getOperationKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:885:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:886:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:886:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:887:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassOperation2127); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleClassOperation2144); 

                	newLeafNode(otherlv_2, grammarAccess.getClassOperationAccess().getEqualsSignKeyword_2());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:907:1: ( (lv_class_3_0= ruleNativeClass ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:908:1: (lv_class_3_0= ruleNativeClass )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:908:1: (lv_class_3_0= ruleNativeClass )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:909:3: lv_class_3_0= ruleNativeClass
            {
             
            	        newCompositeNode(grammarAccess.getClassOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeClass_in_ruleClassOperation2165);
            lv_class_3_0=ruleNativeClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassOperationRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"NativeClass");
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
    // $ANTLR end "ruleClassOperation"


    // $ANTLR start "entryRuleMethodOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:933:1: entryRuleMethodOperation returns [EObject current=null] : iv_ruleMethodOperation= ruleMethodOperation EOF ;
    public final EObject entryRuleMethodOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodOperation = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:934:2: (iv_ruleMethodOperation= ruleMethodOperation EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:935:2: iv_ruleMethodOperation= ruleMethodOperation EOF
            {
             newCompositeNode(grammarAccess.getMethodOperationRule()); 
            pushFollow(FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation2201);
            iv_ruleMethodOperation=ruleMethodOperation();

            state._fsp--;

             current =iv_ruleMethodOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodOperation2211); 

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
    // $ANTLR end "entryRuleMethodOperation"


    // $ANTLR start "ruleMethodOperation"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:942:1: ruleMethodOperation returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ( (lv_signature_6_0= ruleSignature ) ) ) ;
    public final EObject ruleMethodOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_class_3_0 = null;

        EObject lv_method_5_0 = null;

        EObject lv_signature_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:945:28: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ( (lv_signature_6_0= ruleSignature ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:946:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ( (lv_signature_6_0= ruleSignature ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:946:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ( (lv_signature_6_0= ruleSignature ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:946:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ( (lv_signature_6_0= ruleSignature ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleMethodOperation2248); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodOperationAccess().getMethodKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:950:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:951:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:951:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:952:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodOperation2265); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMethodOperation2282); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:972:1: ( (lv_class_3_0= ruleNativeClass ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:973:1: (lv_class_3_0= ruleNativeClass )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:973:1: (lv_class_3_0= ruleNativeClass )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:974:3: lv_class_3_0= ruleNativeClass
            {
             
            	        newCompositeNode(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeClass_in_ruleMethodOperation2303);
            lv_class_3_0=ruleNativeClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodOperationRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"NativeClass");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMethodOperation2315); 

                	newLeafNode(otherlv_4, grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:994:1: ( (lv_method_5_0= ruleNativeMethod ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:995:1: (lv_method_5_0= ruleNativeMethod )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:995:1: (lv_method_5_0= ruleNativeMethod )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:996:3: lv_method_5_0= ruleNativeMethod
            {
             
            	        newCompositeNode(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleNativeMethod_in_ruleMethodOperation2336);
            lv_method_5_0=ruleNativeMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodOperationRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_5_0, 
                    		"NativeMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1012:2: ( (lv_signature_6_0= ruleSignature ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1013:1: (lv_signature_6_0= ruleSignature )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1013:1: (lv_signature_6_0= ruleSignature )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1014:3: lv_signature_6_0= ruleSignature
            {
             
            	        newCompositeNode(grammarAccess.getMethodOperationAccess().getSignatureSignatureParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSignature_in_ruleMethodOperation2357);
            lv_signature_6_0=ruleSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodOperationRule());
            	        }
                   		set(
                   			current, 
                   			"signature",
                    		lv_signature_6_0, 
                    		"Signature");
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
    // $ANTLR end "ruleMethodOperation"


    // $ANTLR start "entryRuleSignature"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1038:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1039:2: (iv_ruleSignature= ruleSignature EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1040:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_ruleSignature_in_entryRuleSignature2393);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignature2403); 

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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1047:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'as' ( (lv_type_1_0= ruleGenericType ) ) ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1050:28: ( (otherlv_0= 'as' ( (lv_type_1_0= ruleGenericType ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1051:1: (otherlv_0= 'as' ( (lv_type_1_0= ruleGenericType ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1051:1: (otherlv_0= 'as' ( (lv_type_1_0= ruleGenericType ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1051:3: otherlv_0= 'as' ( (lv_type_1_0= ruleGenericType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSignature2440); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getAsKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1055:1: ( (lv_type_1_0= ruleGenericType ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1056:1: (lv_type_1_0= ruleGenericType )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1056:1: (lv_type_1_0= ruleGenericType )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1057:3: lv_type_1_0= ruleGenericType
            {
             
            	        newCompositeNode(grammarAccess.getSignatureAccess().getTypeGenericTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGenericType_in_ruleSignature2461);
            lv_type_1_0=ruleGenericType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"GenericType");
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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleGenericType"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1081:1: entryRuleGenericType returns [EObject current=null] : iv_ruleGenericType= ruleGenericType EOF ;
    public final EObject entryRuleGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericType = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1082:2: (iv_ruleGenericType= ruleGenericType EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1083:2: iv_ruleGenericType= ruleGenericType EOF
            {
             newCompositeNode(grammarAccess.getGenericTypeRule()); 
            pushFollow(FOLLOW_ruleGenericType_in_entryRuleGenericType2497);
            iv_ruleGenericType=ruleGenericType();

            state._fsp--;

             current =iv_ruleGenericType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericType2507); 

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
    // $ANTLR end "entryRuleGenericType"


    // $ANTLR start "ruleGenericType"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1090:1: ruleGenericType returns [EObject current=null] : ( ( (lv_operationType_0_0= ruleOperationType ) ) ( (lv_operationTypeParameters_1_0= ruleOperationTypeParameters ) )? ) ;
    public final EObject ruleGenericType() throws RecognitionException {
        EObject current = null;

        EObject lv_operationType_0_0 = null;

        EObject lv_operationTypeParameters_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1093:28: ( ( ( (lv_operationType_0_0= ruleOperationType ) ) ( (lv_operationTypeParameters_1_0= ruleOperationTypeParameters ) )? ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1094:1: ( ( (lv_operationType_0_0= ruleOperationType ) ) ( (lv_operationTypeParameters_1_0= ruleOperationTypeParameters ) )? )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1094:1: ( ( (lv_operationType_0_0= ruleOperationType ) ) ( (lv_operationTypeParameters_1_0= ruleOperationTypeParameters ) )? )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1094:2: ( (lv_operationType_0_0= ruleOperationType ) ) ( (lv_operationTypeParameters_1_0= ruleOperationTypeParameters ) )?
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1094:2: ( (lv_operationType_0_0= ruleOperationType ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1095:1: (lv_operationType_0_0= ruleOperationType )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1095:1: (lv_operationType_0_0= ruleOperationType )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1096:3: lv_operationType_0_0= ruleOperationType
            {
             
            	        newCompositeNode(grammarAccess.getGenericTypeAccess().getOperationTypeOperationTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleOperationType_in_ruleGenericType2553);
            lv_operationType_0_0=ruleOperationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGenericTypeRule());
            	        }
                   		set(
                   			current, 
                   			"operationType",
                    		lv_operationType_0_0, 
                    		"OperationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1112:2: ( (lv_operationTypeParameters_1_0= ruleOperationTypeParameters ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1113:1: (lv_operationTypeParameters_1_0= ruleOperationTypeParameters )
                    {
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1113:1: (lv_operationTypeParameters_1_0= ruleOperationTypeParameters )
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1114:3: lv_operationTypeParameters_1_0= ruleOperationTypeParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getGenericTypeAccess().getOperationTypeParametersOperationTypeParametersParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperationTypeParameters_in_ruleGenericType2574);
                    lv_operationTypeParameters_1_0=ruleOperationTypeParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGenericTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"operationTypeParameters",
                            		lv_operationTypeParameters_1_0, 
                            		"OperationTypeParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleGenericType"


    // $ANTLR start "entryRuleOperationType"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1138:1: entryRuleOperationType returns [EObject current=null] : iv_ruleOperationType= ruleOperationType EOF ;
    public final EObject entryRuleOperationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationType = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1139:2: (iv_ruleOperationType= ruleOperationType EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1140:2: iv_ruleOperationType= ruleOperationType EOF
            {
             newCompositeNode(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_ruleOperationType_in_entryRuleOperationType2611);
            iv_ruleOperationType=ruleOperationType();

            state._fsp--;

             current =iv_ruleOperationType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationType2621); 

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
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1147:1: ruleOperationType returns [EObject current=null] : ( ( (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' ) ) ) ;
    public final EObject ruleOperationType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1150:28: ( ( ( (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1151:1: ( ( (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1151:1: ( ( (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1152:1: ( (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1152:1: ( (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1153:1: (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1153:1: (lv_name_0_1= 'Action' | lv_name_0_2= 'Func' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1154:3: lv_name_0_1= 'Action'
                    {
                    lv_name_0_1=(Token)match(input,25,FOLLOW_25_in_ruleOperationType2665); 

                            newLeafNode(lv_name_0_1, grammarAccess.getOperationTypeAccess().getNameActionKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1166:8: lv_name_0_2= 'Func'
                    {
                    lv_name_0_2=(Token)match(input,26,FOLLOW_26_in_ruleOperationType2694); 

                            newLeafNode(lv_name_0_2, grammarAccess.getOperationTypeAccess().getNameFuncKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationTypeRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_2, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleOperationTypeParameters"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1189:1: entryRuleOperationTypeParameters returns [EObject current=null] : iv_ruleOperationTypeParameters= ruleOperationTypeParameters EOF ;
    public final EObject entryRuleOperationTypeParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationTypeParameters = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1190:2: (iv_ruleOperationTypeParameters= ruleOperationTypeParameters EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1191:2: iv_ruleOperationTypeParameters= ruleOperationTypeParameters EOF
            {
             newCompositeNode(grammarAccess.getOperationTypeParametersRule()); 
            pushFollow(FOLLOW_ruleOperationTypeParameters_in_entryRuleOperationTypeParameters2745);
            iv_ruleOperationTypeParameters=ruleOperationTypeParameters();

            state._fsp--;

             current =iv_ruleOperationTypeParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationTypeParameters2755); 

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
    // $ANTLR end "entryRuleOperationTypeParameters"


    // $ANTLR start "ruleOperationTypeParameters"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1198:1: ruleOperationTypeParameters returns [EObject current=null] : (otherlv_0= '<' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ( (lv_typeParameters_2_0= ruleCSTypeParameter ) )* otherlv_3= '>' ) ;
    public final EObject ruleOperationTypeParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_typeParameter_1_0 = null;

        EObject lv_typeParameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1201:28: ( (otherlv_0= '<' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ( (lv_typeParameters_2_0= ruleCSTypeParameter ) )* otherlv_3= '>' ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1202:1: (otherlv_0= '<' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ( (lv_typeParameters_2_0= ruleCSTypeParameter ) )* otherlv_3= '>' )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1202:1: (otherlv_0= '<' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ( (lv_typeParameters_2_0= ruleCSTypeParameter ) )* otherlv_3= '>' )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1202:3: otherlv_0= '<' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ( (lv_typeParameters_2_0= ruleCSTypeParameter ) )* otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleOperationTypeParameters2792); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationTypeParametersAccess().getLessThanSignKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1206:1: ( (lv_typeParameter_1_0= ruleTypeParameter ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1207:1: (lv_typeParameter_1_0= ruleTypeParameter )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1207:1: (lv_typeParameter_1_0= ruleTypeParameter )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1208:3: lv_typeParameter_1_0= ruleTypeParameter
            {
             
            	        newCompositeNode(grammarAccess.getOperationTypeParametersAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeParameter_in_ruleOperationTypeParameters2813);
            lv_typeParameter_1_0=ruleTypeParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationTypeParametersRule());
            	        }
                   		set(
                   			current, 
                   			"typeParameter",
                    		lv_typeParameter_1_0, 
                    		"TypeParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1224:2: ( (lv_typeParameters_2_0= ruleCSTypeParameter ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1225:1: (lv_typeParameters_2_0= ruleCSTypeParameter )
            	    {
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1225:1: (lv_typeParameters_2_0= ruleCSTypeParameter )
            	    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1226:3: lv_typeParameters_2_0= ruleCSTypeParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperationTypeParametersAccess().getTypeParametersCSTypeParameterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCSTypeParameter_in_ruleOperationTypeParameters2834);
            	    lv_typeParameters_2_0=ruleCSTypeParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperationTypeParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeParameters",
            	            		lv_typeParameters_2_0, 
            	            		"CSTypeParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleOperationTypeParameters2847); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationTypeParametersAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleOperationTypeParameters"


    // $ANTLR start "entryRuleTypeParameter"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1254:1: entryRuleTypeParameter returns [EObject current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final EObject entryRuleTypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameter = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1255:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1256:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter2883);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter2893); 

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
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1263:1: ruleTypeParameter returns [EObject current=null] : (this_GenericType_0= ruleGenericType | this_Type_1= ruleType ) ;
    public final EObject ruleTypeParameter() throws RecognitionException {
        EObject current = null;

        EObject this_GenericType_0 = null;

        EObject this_Type_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1266:28: ( (this_GenericType_0= ruleGenericType | this_Type_1= ruleType ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1267:1: (this_GenericType_0= ruleGenericType | this_Type_1= ruleType )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1267:1: (this_GenericType_0= ruleGenericType | this_Type_1= ruleType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=25 && LA14_0<=26)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1268:5: this_GenericType_0= ruleGenericType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getGenericTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGenericType_in_ruleTypeParameter2940);
                    this_GenericType_0=ruleGenericType();

                    state._fsp--;

                     
                            current = this_GenericType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1278:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleTypeParameter2967);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
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
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleCSTypeParameter"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1294:1: entryRuleCSTypeParameter returns [EObject current=null] : iv_ruleCSTypeParameter= ruleCSTypeParameter EOF ;
    public final EObject entryRuleCSTypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSTypeParameter = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1295:2: (iv_ruleCSTypeParameter= ruleCSTypeParameter EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1296:2: iv_ruleCSTypeParameter= ruleCSTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getCSTypeParameterRule()); 
            pushFollow(FOLLOW_ruleCSTypeParameter_in_entryRuleCSTypeParameter3002);
            iv_ruleCSTypeParameter=ruleCSTypeParameter();

            state._fsp--;

             current =iv_ruleCSTypeParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSTypeParameter3012); 

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
    // $ANTLR end "entryRuleCSTypeParameter"


    // $ANTLR start "ruleCSTypeParameter"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1303:1: ruleCSTypeParameter returns [EObject current=null] : (otherlv_0= ',' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ) ;
    public final EObject ruleCSTypeParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeParameter_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1306:28: ( (otherlv_0= ',' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1307:1: (otherlv_0= ',' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1307:1: (otherlv_0= ',' ( (lv_typeParameter_1_0= ruleTypeParameter ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1307:3: otherlv_0= ',' ( (lv_typeParameter_1_0= ruleTypeParameter ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleCSTypeParameter3049); 

                	newLeafNode(otherlv_0, grammarAccess.getCSTypeParameterAccess().getCommaKeyword_0());
                
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1311:1: ( (lv_typeParameter_1_0= ruleTypeParameter ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1312:1: (lv_typeParameter_1_0= ruleTypeParameter )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1312:1: (lv_typeParameter_1_0= ruleTypeParameter )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1313:3: lv_typeParameter_1_0= ruleTypeParameter
            {
             
            	        newCompositeNode(grammarAccess.getCSTypeParameterAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeParameter_in_ruleCSTypeParameter3070);
            lv_typeParameter_1_0=ruleTypeParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCSTypeParameterRule());
            	        }
                   		set(
                   			current, 
                   			"typeParameter",
                    		lv_typeParameter_1_0, 
                    		"TypeParameter");
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
    // $ANTLR end "ruleCSTypeParameter"


    // $ANTLR start "entryRuleType"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1337:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1338:2: (iv_ruleType= ruleType EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1339:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3106);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3116); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1346:1: ruleType returns [EObject current=null] : ( (lv_reference_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1349:28: ( ( (lv_reference_0_0= ruleQualifiedName ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1350:1: ( (lv_reference_0_0= ruleQualifiedName ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1350:1: ( (lv_reference_0_0= ruleQualifiedName ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1351:1: (lv_reference_0_0= ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1351:1: (lv_reference_0_0= ruleQualifiedName )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1352:3: lv_reference_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTypeAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleType3161);
            lv_reference_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNativeMethod"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1376:1: entryRuleNativeMethod returns [EObject current=null] : iv_ruleNativeMethod= ruleNativeMethod EOF ;
    public final EObject entryRuleNativeMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeMethod = null;


        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1377:2: (iv_ruleNativeMethod= ruleNativeMethod EOF )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1378:2: iv_ruleNativeMethod= ruleNativeMethod EOF
            {
             newCompositeNode(grammarAccess.getNativeMethodRule()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod3196);
            iv_ruleNativeMethod=ruleNativeMethod();

            state._fsp--;

             current =iv_ruleNativeMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeMethod3206); 

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
    // $ANTLR end "entryRuleNativeMethod"


    // $ANTLR start "ruleNativeMethod"
    // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1385:1: ruleNativeMethod returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNativeMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1388:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1389:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1389:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1390:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1390:1: (lv_name_0_0= RULE_ID )
            // ../de.grammarcraft.csflow/src-gen/de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.g:1391:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNativeMethod3247); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNativeMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleNativeMethod"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel144 = new BitSet(new long[]{0x0000000000686002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel167 = new BitSet(new long[]{0x0000000000686002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_ruleModel189 = new BitSet(new long[]{0x0000000000684002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName278 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName312 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUnit369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleFunctionUnit416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFunctionUnit443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFlow629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlow646 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleStream_in_ruleFlow672 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_ruleStream765 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStream777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStream798 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStream810 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleRightPort_in_ruleStream831 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStream843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_entryRuleLeftPort879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPort889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_ruleLeftPort936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_ruleLeftPort963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_ruleLeftPort990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInputPort1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGlobalInputPort1072 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGlobalInputPort1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUnnamedSubFlowPort1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_entryRuleRightPort1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPort1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_ruleRightPort1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_ruleRightPort1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_ruleRightPort1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalOutputPort1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGlobalOutputPort1414 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGlobalOutputPort1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1526 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_rulePort1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_entryRuleNamedPort1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPort1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNamedPort1631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedPort1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_ruleOperation1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_ruleOperation1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOperation_in_ruleOperation1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation1835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEbcOperation1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEbcOperation1882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEbcOperation1899 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEbcOperation1916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNativeClass_in_ruleEbcOperation1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_entryRuleNativeClass1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeClass1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNativeClass2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOperation_in_entryRuleClassOperation2063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOperation2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleClassOperation2110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassOperation2127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleClassOperation2144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNativeClass_in_ruleClassOperation2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodOperation2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMethodOperation2248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodOperation2265 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethodOperation2282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNativeClass_in_ruleMethodOperation2303 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMethodOperation2315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_ruleMethodOperation2336 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSignature_in_ruleMethodOperation2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignature2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSignature2440 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleGenericType_in_ruleSignature2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_entryRuleGenericType2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericType2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationType_in_ruleGenericType2553 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOperationTypeParameters_in_ruleGenericType2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationType_in_entryRuleOperationType2611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationType2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOperationType2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperationType2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationTypeParameters_in_entryRuleOperationTypeParameters2745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationTypeParameters2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperationTypeParameters2792 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleOperationTypeParameters2813 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_ruleCSTypeParameter_in_ruleOperationTypeParameters2834 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_15_in_ruleOperationTypeParameters2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_ruleTypeParameter2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeParameter2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSTypeParameter_in_entryRuleCSTypeParameter3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSTypeParameter3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCSTypeParameter3049 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleCSTypeParameter3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleType3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod3196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeMethod3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNativeMethod3247 = new BitSet(new long[]{0x0000000000000002L});

}