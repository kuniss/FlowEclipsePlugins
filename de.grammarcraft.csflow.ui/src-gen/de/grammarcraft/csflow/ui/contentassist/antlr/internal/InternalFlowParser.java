package de.grammarcraft.csflow.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.grammarcraft.csflow.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Action'", "'Func'", "'package'", "'.'", "'import'", "'flow'", "'>'", "';'", "'in'", "'out'", "'ebc'", "'='", "'operation'", "'method'", "'#'", "'as'", "'<'", "','"
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
    public String getGrammarFileName() { return "../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g"; }


     
     	private FlowGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:61:1: ( ruleModel EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:76:1: ( rule__Model__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:89:1: ( ruleQualifiedName EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFunctionUnit"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:116:1: entryRuleFunctionUnit : ruleFunctionUnit EOF ;
    public final void entryRuleFunctionUnit() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:117:1: ( ruleFunctionUnit EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:118:1: ruleFunctionUnit EOF
            {
             before(grammarAccess.getFunctionUnitRule()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit181);
            ruleFunctionUnit();

            state._fsp--;

             after(grammarAccess.getFunctionUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUnit188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionUnit"


    // $ANTLR start "ruleFunctionUnit"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:125:1: ruleFunctionUnit : ( ( rule__FunctionUnit__Alternatives ) ) ;
    public final void ruleFunctionUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:129:2: ( ( ( rule__FunctionUnit__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:130:1: ( ( rule__FunctionUnit__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:130:1: ( ( rule__FunctionUnit__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:131:1: ( rule__FunctionUnit__Alternatives )
            {
             before(grammarAccess.getFunctionUnitAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:132:1: ( rule__FunctionUnit__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:132:2: rule__FunctionUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionUnit__Alternatives_in_ruleFunctionUnit214);
            rule__FunctionUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionUnit"


    // $ANTLR start "entryRuleImport"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:145:1: ( ruleImport EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:160:1: ( rule__Import__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFlow"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:172:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:173:1: ( ruleFlow EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:174:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow301);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:181:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:185:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:186:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:186:1: ( ( rule__Flow__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:187:1: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:188:1: ( rule__Flow__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:188:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow334);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleStream"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:200:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:201:1: ( ruleStream EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:202:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream361);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:209:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:213:2: ( ( ( rule__Stream__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:214:1: ( ( rule__Stream__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:214:1: ( ( rule__Stream__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:215:1: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:216:1: ( rule__Stream__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:216:2: rule__Stream__Group__0
            {
            pushFollow(FOLLOW_rule__Stream__Group__0_in_ruleStream394);
            rule__Stream__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleLeftPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:228:1: entryRuleLeftPort : ruleLeftPort EOF ;
    public final void entryRuleLeftPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:229:1: ( ruleLeftPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:230:1: ruleLeftPort EOF
            {
             before(grammarAccess.getLeftPortRule()); 
            pushFollow(FOLLOW_ruleLeftPort_in_entryRuleLeftPort421);
            ruleLeftPort();

            state._fsp--;

             after(grammarAccess.getLeftPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPort428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftPort"


    // $ANTLR start "ruleLeftPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:237:1: ruleLeftPort : ( ( rule__LeftPort__Alternatives ) ) ;
    public final void ruleLeftPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:241:2: ( ( ( rule__LeftPort__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:242:1: ( ( rule__LeftPort__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:242:1: ( ( rule__LeftPort__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:243:1: ( rule__LeftPort__Alternatives )
            {
             before(grammarAccess.getLeftPortAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:244:1: ( rule__LeftPort__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:244:2: rule__LeftPort__Alternatives
            {
            pushFollow(FOLLOW_rule__LeftPort__Alternatives_in_ruleLeftPort454);
            rule__LeftPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLeftPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftPort"


    // $ANTLR start "entryRuleGlobalInputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:256:1: entryRuleGlobalInputPort : ruleGlobalInputPort EOF ;
    public final void entryRuleGlobalInputPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:257:1: ( ruleGlobalInputPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:258:1: ruleGlobalInputPort EOF
            {
             before(grammarAccess.getGlobalInputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort481);
            ruleGlobalInputPort();

            state._fsp--;

             after(grammarAccess.getGlobalInputPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInputPort488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalInputPort"


    // $ANTLR start "ruleGlobalInputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:265:1: ruleGlobalInputPort : ( ( rule__GlobalInputPort__Group__0 ) ) ;
    public final void ruleGlobalInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:269:2: ( ( ( rule__GlobalInputPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:270:1: ( ( rule__GlobalInputPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:270:1: ( ( rule__GlobalInputPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:271:1: ( rule__GlobalInputPort__Group__0 )
            {
             before(grammarAccess.getGlobalInputPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:272:1: ( rule__GlobalInputPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:272:2: rule__GlobalInputPort__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__0_in_ruleGlobalInputPort514);
            rule__GlobalInputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalInputPort"


    // $ANTLR start "entryRuleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:284:1: entryRuleUnnamedSubFlowPort : ruleUnnamedSubFlowPort EOF ;
    public final void entryRuleUnnamedSubFlowPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:285:1: ( ruleUnnamedSubFlowPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:286:1: ruleUnnamedSubFlowPort EOF
            {
             before(grammarAccess.getUnnamedSubFlowPortRule()); 
            pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort541);
            ruleUnnamedSubFlowPort();

            state._fsp--;

             after(grammarAccess.getUnnamedSubFlowPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnnamedSubFlowPort"


    // $ANTLR start "ruleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:293:1: ruleUnnamedSubFlowPort : ( ( rule__UnnamedSubFlowPort__Group__0 ) ) ;
    public final void ruleUnnamedSubFlowPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:297:2: ( ( ( rule__UnnamedSubFlowPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:298:1: ( ( rule__UnnamedSubFlowPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:298:1: ( ( rule__UnnamedSubFlowPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:299:1: ( rule__UnnamedSubFlowPort__Group__0 )
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:300:1: ( rule__UnnamedSubFlowPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:300:2: rule__UnnamedSubFlowPort__Group__0
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__0_in_ruleUnnamedSubFlowPort574);
            rule__UnnamedSubFlowPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnnamedSubFlowPort"


    // $ANTLR start "entryRuleRightPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:312:1: entryRuleRightPort : ruleRightPort EOF ;
    public final void entryRuleRightPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:313:1: ( ruleRightPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:314:1: ruleRightPort EOF
            {
             before(grammarAccess.getRightPortRule()); 
            pushFollow(FOLLOW_ruleRightPort_in_entryRuleRightPort601);
            ruleRightPort();

            state._fsp--;

             after(grammarAccess.getRightPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPort608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightPort"


    // $ANTLR start "ruleRightPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:321:1: ruleRightPort : ( ( rule__RightPort__Alternatives ) ) ;
    public final void ruleRightPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:325:2: ( ( ( rule__RightPort__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ( ( rule__RightPort__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ( ( rule__RightPort__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:327:1: ( rule__RightPort__Alternatives )
            {
             before(grammarAccess.getRightPortAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:328:1: ( rule__RightPort__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:328:2: rule__RightPort__Alternatives
            {
            pushFollow(FOLLOW_rule__RightPort__Alternatives_in_ruleRightPort634);
            rule__RightPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightPort"


    // $ANTLR start "entryRuleGlobalOutputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:340:1: entryRuleGlobalOutputPort : ruleGlobalOutputPort EOF ;
    public final void entryRuleGlobalOutputPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:341:1: ( ruleGlobalOutputPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:342:1: ruleGlobalOutputPort EOF
            {
             before(grammarAccess.getGlobalOutputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort661);
            ruleGlobalOutputPort();

            state._fsp--;

             after(grammarAccess.getGlobalOutputPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalOutputPort668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalOutputPort"


    // $ANTLR start "ruleGlobalOutputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:349:1: ruleGlobalOutputPort : ( ( rule__GlobalOutputPort__Group__0 ) ) ;
    public final void ruleGlobalOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:353:2: ( ( ( rule__GlobalOutputPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ( ( rule__GlobalOutputPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ( ( rule__GlobalOutputPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:355:1: ( rule__GlobalOutputPort__Group__0 )
            {
             before(grammarAccess.getGlobalOutputPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:356:1: ( rule__GlobalOutputPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:356:2: rule__GlobalOutputPort__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__0_in_ruleGlobalOutputPort694);
            rule__GlobalOutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalOutputPort"


    // $ANTLR start "entryRulePort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:368:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:369:1: ( rulePort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:370:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort721);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:377:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:381:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ( ( rule__Port__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ( ( rule__Port__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:383:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:384:1: ( rule__Port__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:384:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort754);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleNamedPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:396:1: entryRuleNamedPort : ruleNamedPort EOF ;
    public final void entryRuleNamedPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:397:1: ( ruleNamedPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:398:1: ruleNamedPort EOF
            {
             before(grammarAccess.getNamedPortRule()); 
            pushFollow(FOLLOW_ruleNamedPort_in_entryRuleNamedPort781);
            ruleNamedPort();

            state._fsp--;

             after(grammarAccess.getNamedPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPort788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedPort"


    // $ANTLR start "ruleNamedPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:405:1: ruleNamedPort : ( ( rule__NamedPort__Group__0 ) ) ;
    public final void ruleNamedPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:409:2: ( ( ( rule__NamedPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ( ( rule__NamedPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ( ( rule__NamedPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:411:1: ( rule__NamedPort__Group__0 )
            {
             before(grammarAccess.getNamedPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:412:1: ( rule__NamedPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:412:2: rule__NamedPort__Group__0
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__0_in_ruleNamedPort814);
            rule__NamedPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedPort"


    // $ANTLR start "entryRuleOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:424:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:425:1: ( ruleOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:426:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation841);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:433:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:437:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ( ( rule__Operation__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:439:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:440:1: ( rule__Operation__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:440:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation874);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEbcOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:452:1: entryRuleEbcOperation : ruleEbcOperation EOF ;
    public final void entryRuleEbcOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:453:1: ( ruleEbcOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:454:1: ruleEbcOperation EOF
            {
             before(grammarAccess.getEbcOperationRule()); 
            pushFollow(FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation901);
            ruleEbcOperation();

            state._fsp--;

             after(grammarAccess.getEbcOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEbcOperation908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEbcOperation"


    // $ANTLR start "ruleEbcOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:461:1: ruleEbcOperation : ( ( rule__EbcOperation__Group__0 ) ) ;
    public final void ruleEbcOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:465:2: ( ( ( rule__EbcOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ( ( rule__EbcOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ( ( rule__EbcOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:467:1: ( rule__EbcOperation__Group__0 )
            {
             before(grammarAccess.getEbcOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:468:1: ( rule__EbcOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:468:2: rule__EbcOperation__Group__0
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__0_in_ruleEbcOperation934);
            rule__EbcOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEbcOperation"


    // $ANTLR start "entryRuleNativeClass"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:480:1: entryRuleNativeClass : ruleNativeClass EOF ;
    public final void entryRuleNativeClass() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:481:1: ( ruleNativeClass EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:482:1: ruleNativeClass EOF
            {
             before(grammarAccess.getNativeClassRule()); 
            pushFollow(FOLLOW_ruleNativeClass_in_entryRuleNativeClass961);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getNativeClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeClass968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeClass"


    // $ANTLR start "ruleNativeClass"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:489:1: ruleNativeClass : ( ( rule__NativeClass__ReferenceAssignment ) ) ;
    public final void ruleNativeClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:493:2: ( ( ( rule__NativeClass__ReferenceAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ( ( rule__NativeClass__ReferenceAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ( ( rule__NativeClass__ReferenceAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:495:1: ( rule__NativeClass__ReferenceAssignment )
            {
             before(grammarAccess.getNativeClassAccess().getReferenceAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:496:1: ( rule__NativeClass__ReferenceAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:496:2: rule__NativeClass__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__NativeClass__ReferenceAssignment_in_ruleNativeClass994);
            rule__NativeClass__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeClassAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeClass"


    // $ANTLR start "entryRuleClassOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:508:1: entryRuleClassOperation : ruleClassOperation EOF ;
    public final void entryRuleClassOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:509:1: ( ruleClassOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:510:1: ruleClassOperation EOF
            {
             before(grammarAccess.getClassOperationRule()); 
            pushFollow(FOLLOW_ruleClassOperation_in_entryRuleClassOperation1021);
            ruleClassOperation();

            state._fsp--;

             after(grammarAccess.getClassOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOperation1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassOperation"


    // $ANTLR start "ruleClassOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:517:1: ruleClassOperation : ( ( rule__ClassOperation__Group__0 ) ) ;
    public final void ruleClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:521:2: ( ( ( rule__ClassOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ( ( rule__ClassOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ( ( rule__ClassOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:523:1: ( rule__ClassOperation__Group__0 )
            {
             before(grammarAccess.getClassOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:524:1: ( rule__ClassOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:524:2: rule__ClassOperation__Group__0
            {
            pushFollow(FOLLOW_rule__ClassOperation__Group__0_in_ruleClassOperation1054);
            rule__ClassOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassOperation"


    // $ANTLR start "entryRuleMethodOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:536:1: entryRuleMethodOperation : ruleMethodOperation EOF ;
    public final void entryRuleMethodOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:537:1: ( ruleMethodOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:538:1: ruleMethodOperation EOF
            {
             before(grammarAccess.getMethodOperationRule()); 
            pushFollow(FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1081);
            ruleMethodOperation();

            state._fsp--;

             after(grammarAccess.getMethodOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodOperation1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodOperation"


    // $ANTLR start "ruleMethodOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:545:1: ruleMethodOperation : ( ( rule__MethodOperation__Group__0 ) ) ;
    public final void ruleMethodOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:549:2: ( ( ( rule__MethodOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ( ( rule__MethodOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ( ( rule__MethodOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:551:1: ( rule__MethodOperation__Group__0 )
            {
             before(grammarAccess.getMethodOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:552:1: ( rule__MethodOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:552:2: rule__MethodOperation__Group__0
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__0_in_ruleMethodOperation1114);
            rule__MethodOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodOperation"


    // $ANTLR start "entryRuleSignature"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:564:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:565:1: ( ruleSignature EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:566:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_ruleSignature_in_entryRuleSignature1141);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignature1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:573:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:577:2: ( ( ( rule__Signature__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:578:1: ( ( rule__Signature__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:578:1: ( ( rule__Signature__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:579:1: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:580:1: ( rule__Signature__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:580:2: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_rule__Signature__Group__0_in_ruleSignature1174);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleGenericType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:592:1: entryRuleGenericType : ruleGenericType EOF ;
    public final void entryRuleGenericType() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:593:1: ( ruleGenericType EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:594:1: ruleGenericType EOF
            {
             before(grammarAccess.getGenericTypeRule()); 
            pushFollow(FOLLOW_ruleGenericType_in_entryRuleGenericType1201);
            ruleGenericType();

            state._fsp--;

             after(grammarAccess.getGenericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericType1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericType"


    // $ANTLR start "ruleGenericType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:601:1: ruleGenericType : ( ( rule__GenericType__Group__0 ) ) ;
    public final void ruleGenericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:605:2: ( ( ( rule__GenericType__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:606:1: ( ( rule__GenericType__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:606:1: ( ( rule__GenericType__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:607:1: ( rule__GenericType__Group__0 )
            {
             before(grammarAccess.getGenericTypeAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:608:1: ( rule__GenericType__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:608:2: rule__GenericType__Group__0
            {
            pushFollow(FOLLOW_rule__GenericType__Group__0_in_ruleGenericType1234);
            rule__GenericType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericType"


    // $ANTLR start "entryRuleOperationType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:620:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:621:1: ( ruleOperationType EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:622:1: ruleOperationType EOF
            {
             before(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_ruleOperationType_in_entryRuleOperationType1261);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationType1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:629:1: ruleOperationType : ( ( rule__OperationType__NameAssignment ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:633:2: ( ( ( rule__OperationType__NameAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:634:1: ( ( rule__OperationType__NameAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:634:1: ( ( rule__OperationType__NameAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:635:1: ( rule__OperationType__NameAssignment )
            {
             before(grammarAccess.getOperationTypeAccess().getNameAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:636:1: ( rule__OperationType__NameAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:636:2: rule__OperationType__NameAssignment
            {
            pushFollow(FOLLOW_rule__OperationType__NameAssignment_in_ruleOperationType1294);
            rule__OperationType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleOperationTypeParameters"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:648:1: entryRuleOperationTypeParameters : ruleOperationTypeParameters EOF ;
    public final void entryRuleOperationTypeParameters() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:649:1: ( ruleOperationTypeParameters EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:650:1: ruleOperationTypeParameters EOF
            {
             before(grammarAccess.getOperationTypeParametersRule()); 
            pushFollow(FOLLOW_ruleOperationTypeParameters_in_entryRuleOperationTypeParameters1321);
            ruleOperationTypeParameters();

            state._fsp--;

             after(grammarAccess.getOperationTypeParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationTypeParameters1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationTypeParameters"


    // $ANTLR start "ruleOperationTypeParameters"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:657:1: ruleOperationTypeParameters : ( ( rule__OperationTypeParameters__Group__0 ) ) ;
    public final void ruleOperationTypeParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:661:2: ( ( ( rule__OperationTypeParameters__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:662:1: ( ( rule__OperationTypeParameters__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:662:1: ( ( rule__OperationTypeParameters__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:663:1: ( rule__OperationTypeParameters__Group__0 )
            {
             before(grammarAccess.getOperationTypeParametersAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:664:1: ( rule__OperationTypeParameters__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:664:2: rule__OperationTypeParameters__Group__0
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__0_in_ruleOperationTypeParameters1354);
            rule__OperationTypeParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationTypeParameters"


    // $ANTLR start "entryRuleTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:676:1: entryRuleTypeParameter : ruleTypeParameter EOF ;
    public final void entryRuleTypeParameter() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:677:1: ( ruleTypeParameter EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:678:1: ruleTypeParameter EOF
            {
             before(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1381);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:685:1: ruleTypeParameter : ( ( rule__TypeParameter__Alternatives ) ) ;
    public final void ruleTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:689:2: ( ( ( rule__TypeParameter__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:690:1: ( ( rule__TypeParameter__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:690:1: ( ( rule__TypeParameter__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:691:1: ( rule__TypeParameter__Alternatives )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:692:1: ( rule__TypeParameter__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:692:2: rule__TypeParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter1414);
            rule__TypeParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleCSTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:704:1: entryRuleCSTypeParameter : ruleCSTypeParameter EOF ;
    public final void entryRuleCSTypeParameter() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:705:1: ( ruleCSTypeParameter EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:706:1: ruleCSTypeParameter EOF
            {
             before(grammarAccess.getCSTypeParameterRule()); 
            pushFollow(FOLLOW_ruleCSTypeParameter_in_entryRuleCSTypeParameter1441);
            ruleCSTypeParameter();

            state._fsp--;

             after(grammarAccess.getCSTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSTypeParameter1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSTypeParameter"


    // $ANTLR start "ruleCSTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:713:1: ruleCSTypeParameter : ( ( rule__CSTypeParameter__Group__0 ) ) ;
    public final void ruleCSTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:717:2: ( ( ( rule__CSTypeParameter__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:718:1: ( ( rule__CSTypeParameter__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:718:1: ( ( rule__CSTypeParameter__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:719:1: ( rule__CSTypeParameter__Group__0 )
            {
             before(grammarAccess.getCSTypeParameterAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:720:1: ( rule__CSTypeParameter__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:720:2: rule__CSTypeParameter__Group__0
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__Group__0_in_ruleCSTypeParameter1474);
            rule__CSTypeParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSTypeParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSTypeParameter"


    // $ANTLR start "entryRuleType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:732:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:733:1: ( ruleType EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:734:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1501);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:741:1: ruleType : ( ( rule__Type__ReferenceAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:745:2: ( ( ( rule__Type__ReferenceAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:746:1: ( ( rule__Type__ReferenceAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:746:1: ( ( rule__Type__ReferenceAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:747:1: ( rule__Type__ReferenceAssignment )
            {
             before(grammarAccess.getTypeAccess().getReferenceAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:748:1: ( rule__Type__ReferenceAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:748:2: rule__Type__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__Type__ReferenceAssignment_in_ruleType1534);
            rule__Type__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNativeMethod"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:760:1: entryRuleNativeMethod : ruleNativeMethod EOF ;
    public final void entryRuleNativeMethod() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:761:1: ( ruleNativeMethod EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:762:1: ruleNativeMethod EOF
            {
             before(grammarAccess.getNativeMethodRule()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod1561);
            ruleNativeMethod();

            state._fsp--;

             after(grammarAccess.getNativeMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeMethod1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeMethod"


    // $ANTLR start "ruleNativeMethod"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:769:1: ruleNativeMethod : ( ( rule__NativeMethod__NameAssignment ) ) ;
    public final void ruleNativeMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:773:2: ( ( ( rule__NativeMethod__NameAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:774:1: ( ( rule__NativeMethod__NameAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:774:1: ( ( rule__NativeMethod__NameAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:775:1: ( rule__NativeMethod__NameAssignment )
            {
             before(grammarAccess.getNativeMethodAccess().getNameAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:776:1: ( rule__NativeMethod__NameAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:776:2: rule__NativeMethod__NameAssignment
            {
            pushFollow(FOLLOW_rule__NativeMethod__NameAssignment_in_ruleNativeMethod1594);
            rule__NativeMethod__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeMethodAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeMethod"


    // $ANTLR start "rule__FunctionUnit__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:788:1: rule__FunctionUnit__Alternatives : ( ( ruleFlow ) | ( ruleOperation ) );
    public final void rule__FunctionUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:792:1: ( ( ruleFlow ) | ( ruleOperation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==21||(LA1_0>=23 && LA1_0<=24)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:793:1: ( ruleFlow )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:793:1: ( ruleFlow )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:794:1: ruleFlow
                    {
                     before(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFlow_in_rule__FunctionUnit__Alternatives1630);
                    ruleFlow();

                    state._fsp--;

                     after(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:799:6: ( ruleOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:799:6: ( ruleOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:800:1: ruleOperation
                    {
                     before(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__FunctionUnit__Alternatives1647);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUnit__Alternatives"


    // $ANTLR start "rule__LeftPort__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:810:1: rule__LeftPort__Alternatives : ( ( ruleGlobalInputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) );
    public final void rule__LeftPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:814:1: ( ( ruleGlobalInputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==19) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==17) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:815:1: ( ruleGlobalInputPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:815:1: ( ruleGlobalInputPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:816:1: ruleGlobalInputPort
                    {
                     before(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGlobalInputPort_in_rule__LeftPort__Alternatives1679);
                    ruleGlobalInputPort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:821:6: ( ruleUnnamedSubFlowPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:821:6: ( ruleUnnamedSubFlowPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:822:1: ruleUnnamedSubFlowPort
                    {
                     before(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_rule__LeftPort__Alternatives1696);
                    ruleUnnamedSubFlowPort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:827:6: ( rulePort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:827:6: ( rulePort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:828:1: rulePort
                    {
                     before(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePort_in_rule__LeftPort__Alternatives1713);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftPort__Alternatives"


    // $ANTLR start "rule__RightPort__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:838:1: rule__RightPort__Alternatives : ( ( ruleGlobalOutputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) );
    public final void rule__RightPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:842:1: ( ( ruleGlobalOutputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==20) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==18) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:843:1: ( ruleGlobalOutputPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:843:1: ( ruleGlobalOutputPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:844:1: ruleGlobalOutputPort
                    {
                     before(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGlobalOutputPort_in_rule__RightPort__Alternatives1745);
                    ruleGlobalOutputPort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:849:6: ( ruleUnnamedSubFlowPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:849:6: ( ruleUnnamedSubFlowPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:850:1: ruleUnnamedSubFlowPort
                    {
                     before(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_rule__RightPort__Alternatives1762);
                    ruleUnnamedSubFlowPort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:855:6: ( rulePort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:855:6: ( rulePort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:856:1: rulePort
                    {
                     before(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePort_in_rule__RightPort__Alternatives1779);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPort__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:866:1: rule__Operation__Alternatives : ( ( ruleEbcOperation ) | ( ruleMethodOperation ) | ( ruleClassOperation ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:870:1: ( ( ruleEbcOperation ) | ( ruleMethodOperation ) | ( ruleClassOperation ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:871:1: ( ruleEbcOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:871:1: ( ruleEbcOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:872:1: ruleEbcOperation
                    {
                     before(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEbcOperation_in_rule__Operation__Alternatives1811);
                    ruleEbcOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:877:6: ( ruleMethodOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:877:6: ( ruleMethodOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:878:1: ruleMethodOperation
                    {
                     before(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMethodOperation_in_rule__Operation__Alternatives1828);
                    ruleMethodOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:883:6: ( ruleClassOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:883:6: ( ruleClassOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:884:1: ruleClassOperation
                    {
                     before(grammarAccess.getOperationAccess().getClassOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleClassOperation_in_rule__Operation__Alternatives1845);
                    ruleClassOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getClassOperationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__OperationType__NameAlternatives_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:894:1: rule__OperationType__NameAlternatives_0 : ( ( 'Action' ) | ( 'Func' ) );
    public final void rule__OperationType__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:898:1: ( ( 'Action' ) | ( 'Func' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:899:1: ( 'Action' )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:899:1: ( 'Action' )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:900:1: 'Action'
                    {
                     before(grammarAccess.getOperationTypeAccess().getNameActionKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__OperationType__NameAlternatives_01878); 
                     after(grammarAccess.getOperationTypeAccess().getNameActionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:907:6: ( 'Func' )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:907:6: ( 'Func' )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:908:1: 'Func'
                    {
                     before(grammarAccess.getOperationTypeAccess().getNameFuncKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__OperationType__NameAlternatives_01898); 
                     after(grammarAccess.getOperationTypeAccess().getNameFuncKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__NameAlternatives_0"


    // $ANTLR start "rule__TypeParameter__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:920:1: rule__TypeParameter__Alternatives : ( ( ruleGenericType ) | ( ruleType ) );
    public final void rule__TypeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:924:1: ( ( ruleGenericType ) | ( ruleType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:925:1: ( ruleGenericType )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:925:1: ( ruleGenericType )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:926:1: ruleGenericType
                    {
                     before(grammarAccess.getTypeParameterAccess().getGenericTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGenericType_in_rule__TypeParameter__Alternatives1932);
                    ruleGenericType();

                    state._fsp--;

                     after(grammarAccess.getTypeParameterAccess().getGenericTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:931:6: ( ruleType )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:931:6: ( ruleType )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:932:1: ruleType
                    {
                     before(grammarAccess.getTypeParameterAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__TypeParameter__Alternatives1949);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getTypeParameterAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeParameter__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:944:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:948:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:949:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01979);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01982);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:956:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:960:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:961:1: ( ( rule__Model__Group_0__0 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:961:1: ( ( rule__Model__Group_0__0 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:962:1: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:963:1: ( rule__Model__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:963:2: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl2009);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:973:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:977:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:978:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12040);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12043);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:985:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:989:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:990:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:990:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:991:1: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:992:1: ( rule__Model__ImportsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:992:2: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl2070);
            	    rule__Model__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1002:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1006:1: ( rule__Model__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1007:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22101);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1013:1: rule__Model__Group__2__Impl : ( ( rule__Model__FunctionUnitsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1017:1: ( ( ( rule__Model__FunctionUnitsAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1018:1: ( ( rule__Model__FunctionUnitsAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1018:1: ( ( rule__Model__FunctionUnitsAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1019:1: ( rule__Model__FunctionUnitsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1020:1: ( rule__Model__FunctionUnitsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||LA9_0==21||(LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1020:2: rule__Model__FunctionUnitsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionUnitsAssignment_2_in_rule__Model__Group__2__Impl2128);
            	    rule__Model__FunctionUnitsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1036:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1040:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1041:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__02165);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__02168);
            rule__Model__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1048:1: rule__Model__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1052:1: ( ( 'package' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1053:1: ( 'package' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1053:1: ( 'package' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1054:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group_0__0__Impl2196); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1067:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1071:1: ( rule__Model__Group_0__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1072:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__12227);
            rule__Model__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1078:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1082:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1083:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1083:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1084:1: ( rule__Model__NameAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1085:1: ( rule__Model__NameAssignment_0_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1085:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl2254);
            rule__Model__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1099:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1103:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1104:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02288);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02291);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1111:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1115:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1116:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1116:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1117:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2318); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1128:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1132:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1133:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12347);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1139:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1143:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1144:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1144:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1145:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1146:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1146:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2374);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1160:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1164:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1165:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02409);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02412);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1172:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1176:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1177:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1177:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1178:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl2440); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1191:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1195:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1196:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12471);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1202:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1206:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1207:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1207:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1208:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2498); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1223:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1227:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1228:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02531);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02534);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1235:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1239:1: ( ( 'import' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1240:1: ( 'import' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1240:1: ( 'import' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1241:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl2562); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1254:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1258:1: ( rule__Import__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1259:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12593);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1265:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1269:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1270:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1270:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1271:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1272:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1272:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2620);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1286:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1290:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1291:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02654);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02657);
            rule__Flow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1298:1: rule__Flow__Group__0__Impl : ( 'flow' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1302:1: ( ( 'flow' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1303:1: ( 'flow' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1303:1: ( 'flow' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1304:1: 'flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Flow__Group__0__Impl2685); 
             after(grammarAccess.getFlowAccess().getFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1317:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1321:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1322:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12716);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12719);
            rule__Flow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1329:1: rule__Flow__Group__1__Impl : ( ( rule__Flow__NameAssignment_1 ) ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1333:1: ( ( ( rule__Flow__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1334:1: ( ( rule__Flow__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1334:1: ( ( rule__Flow__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1335:1: ( rule__Flow__NameAssignment_1 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1336:1: ( rule__Flow__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1336:2: rule__Flow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl2746);
            rule__Flow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1346:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1350:1: ( rule__Flow__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1351:2: rule__Flow__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22776);
            rule__Flow__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1357:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__StreamsAssignment_2 )* ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1361:1: ( ( ( rule__Flow__StreamsAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1362:1: ( ( rule__Flow__StreamsAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1362:1: ( ( rule__Flow__StreamsAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1363:1: ( rule__Flow__StreamsAssignment_2 )*
            {
             before(grammarAccess.getFlowAccess().getStreamsAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1364:1: ( rule__Flow__StreamsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1364:2: rule__Flow__StreamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Flow__StreamsAssignment_2_in_rule__Flow__Group__2__Impl2803);
            	    rule__Flow__StreamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getStreamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1380:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1384:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1385:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_rule__Stream__Group__0__Impl_in_rule__Stream__Group__02840);
            rule__Stream__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__1_in_rule__Stream__Group__02843);
            rule__Stream__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0"


    // $ANTLR start "rule__Stream__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1392:1: rule__Stream__Group__0__Impl : ( ( rule__Stream__LeftPortAssignment_0 ) ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1396:1: ( ( ( rule__Stream__LeftPortAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1397:1: ( ( rule__Stream__LeftPortAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1397:1: ( ( rule__Stream__LeftPortAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1398:1: ( rule__Stream__LeftPortAssignment_0 )
            {
             before(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1399:1: ( rule__Stream__LeftPortAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1399:2: rule__Stream__LeftPortAssignment_0
            {
            pushFollow(FOLLOW_rule__Stream__LeftPortAssignment_0_in_rule__Stream__Group__0__Impl2870);
            rule__Stream__LeftPortAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1409:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1413:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1414:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_rule__Stream__Group__1__Impl_in_rule__Stream__Group__12900);
            rule__Stream__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__2_in_rule__Stream__Group__12903);
            rule__Stream__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1"


    // $ANTLR start "rule__Stream__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1421:1: rule__Stream__Group__1__Impl : ( '>' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1425:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1426:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1426:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1427:1: '>'
            {
             before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Stream__Group__1__Impl2931); 
             after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1__Impl"


    // $ANTLR start "rule__Stream__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1440:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1444:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1445:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_rule__Stream__Group__2__Impl_in_rule__Stream__Group__22962);
            rule__Stream__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__3_in_rule__Stream__Group__22965);
            rule__Stream__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2"


    // $ANTLR start "rule__Stream__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1452:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__MessageAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1456:1: ( ( ( rule__Stream__MessageAssignment_2 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1457:1: ( ( rule__Stream__MessageAssignment_2 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1457:1: ( ( rule__Stream__MessageAssignment_2 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1458:1: ( rule__Stream__MessageAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getMessageAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1459:1: ( rule__Stream__MessageAssignment_2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1459:2: rule__Stream__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__Stream__MessageAssignment_2_in_rule__Stream__Group__2__Impl2992);
            rule__Stream__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1469:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1473:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1474:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
            {
            pushFollow(FOLLOW_rule__Stream__Group__3__Impl_in_rule__Stream__Group__33022);
            rule__Stream__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__4_in_rule__Stream__Group__33025);
            rule__Stream__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3"


    // $ANTLR start "rule__Stream__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1481:1: rule__Stream__Group__3__Impl : ( '>' ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1485:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1486:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1486:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1487:1: '>'
            {
             before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Stream__Group__3__Impl3053); 
             after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group__4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1500:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl rule__Stream__Group__5 ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1504:1: ( rule__Stream__Group__4__Impl rule__Stream__Group__5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1505:2: rule__Stream__Group__4__Impl rule__Stream__Group__5
            {
            pushFollow(FOLLOW_rule__Stream__Group__4__Impl_in_rule__Stream__Group__43084);
            rule__Stream__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__5_in_rule__Stream__Group__43087);
            rule__Stream__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__4"


    // $ANTLR start "rule__Stream__Group__4__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1512:1: rule__Stream__Group__4__Impl : ( ( rule__Stream__RightPortAssignment_4 ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1516:1: ( ( ( rule__Stream__RightPortAssignment_4 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1517:1: ( ( rule__Stream__RightPortAssignment_4 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1517:1: ( ( rule__Stream__RightPortAssignment_4 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1518:1: ( rule__Stream__RightPortAssignment_4 )
            {
             before(grammarAccess.getStreamAccess().getRightPortAssignment_4()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1519:1: ( rule__Stream__RightPortAssignment_4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1519:2: rule__Stream__RightPortAssignment_4
            {
            pushFollow(FOLLOW_rule__Stream__RightPortAssignment_4_in_rule__Stream__Group__4__Impl3114);
            rule__Stream__RightPortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getRightPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__4__Impl"


    // $ANTLR start "rule__Stream__Group__5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1529:1: rule__Stream__Group__5 : rule__Stream__Group__5__Impl ;
    public final void rule__Stream__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1533:1: ( rule__Stream__Group__5__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1534:2: rule__Stream__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Stream__Group__5__Impl_in_rule__Stream__Group__53144);
            rule__Stream__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__5"


    // $ANTLR start "rule__Stream__Group__5__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1540:1: rule__Stream__Group__5__Impl : ( ';' ) ;
    public final void rule__Stream__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1544:1: ( ( ';' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1545:1: ( ';' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1545:1: ( ';' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1546:1: ';'
            {
             before(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Stream__Group__5__Impl3172); 
             after(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__5__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1571:1: rule__GlobalInputPort__Group__0 : rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1 ;
    public final void rule__GlobalInputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1575:1: ( rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1576:2: rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__0__Impl_in_rule__GlobalInputPort__Group__03215);
            rule__GlobalInputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInputPort__Group__1_in_rule__GlobalInputPort__Group__03218);
            rule__GlobalInputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__0"


    // $ANTLR start "rule__GlobalInputPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1583:1: rule__GlobalInputPort__Group__0__Impl : ( '.' ) ;
    public final void rule__GlobalInputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1587:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1588:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1588:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1589:1: '.'
            {
             before(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__GlobalInputPort__Group__0__Impl3246); 
             after(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__0__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1602:1: rule__GlobalInputPort__Group__1 : rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2 ;
    public final void rule__GlobalInputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1606:1: ( rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1607:2: rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__1__Impl_in_rule__GlobalInputPort__Group__13277);
            rule__GlobalInputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInputPort__Group__2_in_rule__GlobalInputPort__Group__13280);
            rule__GlobalInputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__1"


    // $ANTLR start "rule__GlobalInputPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1614:1: rule__GlobalInputPort__Group__1__Impl : ( 'in' ) ;
    public final void rule__GlobalInputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1618:1: ( ( 'in' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1619:1: ( 'in' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1619:1: ( 'in' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1620:1: 'in'
            {
             before(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__GlobalInputPort__Group__1__Impl3308); 
             after(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1633:1: rule__GlobalInputPort__Group__2 : rule__GlobalInputPort__Group__2__Impl ;
    public final void rule__GlobalInputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1637:1: ( rule__GlobalInputPort__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1638:2: rule__GlobalInputPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__2__Impl_in_rule__GlobalInputPort__Group__23339);
            rule__GlobalInputPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__2"


    // $ANTLR start "rule__GlobalInputPort__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1644:1: rule__GlobalInputPort__Group__2__Impl : ( () ) ;
    public final void rule__GlobalInputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1648:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1649:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1649:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1650:1: ()
            {
             before(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1651:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1653:1: 
            {
            }

             after(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__2__Impl"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1669:1: rule__UnnamedSubFlowPort__Group__0 : rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1 ;
    public final void rule__UnnamedSubFlowPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1673:1: ( rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1674:2: rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__0__Impl_in_rule__UnnamedSubFlowPort__Group__03403);
            rule__UnnamedSubFlowPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__1_in_rule__UnnamedSubFlowPort__Group__03406);
            rule__UnnamedSubFlowPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__0"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1681:1: rule__UnnamedSubFlowPort__Group__0__Impl : ( '.' ) ;
    public final void rule__UnnamedSubFlowPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1685:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1686:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1686:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1687:1: '.'
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__UnnamedSubFlowPort__Group__0__Impl3434); 
             after(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__0__Impl"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1700:1: rule__UnnamedSubFlowPort__Group__1 : rule__UnnamedSubFlowPort__Group__1__Impl ;
    public final void rule__UnnamedSubFlowPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1704:1: ( rule__UnnamedSubFlowPort__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1705:2: rule__UnnamedSubFlowPort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__1__Impl_in_rule__UnnamedSubFlowPort__Group__13465);
            rule__UnnamedSubFlowPort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__1"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1711:1: rule__UnnamedSubFlowPort__Group__1__Impl : ( () ) ;
    public final void rule__UnnamedSubFlowPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1715:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1716:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1716:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1717:1: ()
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1718:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1720:1: 
            {
            }

             after(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1734:1: rule__GlobalOutputPort__Group__0 : rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1 ;
    public final void rule__GlobalOutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1738:1: ( rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1739:2: rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__0__Impl_in_rule__GlobalOutputPort__Group__03527);
            rule__GlobalOutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__1_in_rule__GlobalOutputPort__Group__03530);
            rule__GlobalOutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__0"


    // $ANTLR start "rule__GlobalOutputPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1746:1: rule__GlobalOutputPort__Group__0__Impl : ( '.' ) ;
    public final void rule__GlobalOutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1750:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1751:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1751:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1752:1: '.'
            {
             before(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__GlobalOutputPort__Group__0__Impl3558); 
             after(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__0__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1765:1: rule__GlobalOutputPort__Group__1 : rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2 ;
    public final void rule__GlobalOutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1769:1: ( rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1770:2: rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__1__Impl_in_rule__GlobalOutputPort__Group__13589);
            rule__GlobalOutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__2_in_rule__GlobalOutputPort__Group__13592);
            rule__GlobalOutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__1"


    // $ANTLR start "rule__GlobalOutputPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1777:1: rule__GlobalOutputPort__Group__1__Impl : ( 'out' ) ;
    public final void rule__GlobalOutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1781:1: ( ( 'out' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1782:1: ( 'out' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1782:1: ( 'out' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1783:1: 'out'
            {
             before(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__GlobalOutputPort__Group__1__Impl3620); 
             after(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1796:1: rule__GlobalOutputPort__Group__2 : rule__GlobalOutputPort__Group__2__Impl ;
    public final void rule__GlobalOutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1800:1: ( rule__GlobalOutputPort__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1801:2: rule__GlobalOutputPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__2__Impl_in_rule__GlobalOutputPort__Group__23651);
            rule__GlobalOutputPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__2"


    // $ANTLR start "rule__GlobalOutputPort__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1807:1: rule__GlobalOutputPort__Group__2__Impl : ( () ) ;
    public final void rule__GlobalOutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1811:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1812:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1812:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1813:1: ()
            {
             before(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1814:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1816:1: 
            {
            }

             after(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1832:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1836:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1837:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03715);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03718);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1844:1: rule__Port__Group__0__Impl : ( ( rule__Port__FunctionUnitAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1848:1: ( ( ( rule__Port__FunctionUnitAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1849:1: ( ( rule__Port__FunctionUnitAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1849:1: ( ( rule__Port__FunctionUnitAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1850:1: ( rule__Port__FunctionUnitAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1851:1: ( rule__Port__FunctionUnitAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1851:2: rule__Port__FunctionUnitAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__FunctionUnitAssignment_0_in_rule__Port__Group__0__Impl3745);
            rule__Port__FunctionUnitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1861:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1865:1: ( rule__Port__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1866:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13775);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1872:1: rule__Port__Group__1__Impl : ( ( rule__Port__PortAssignment_1 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1876:1: ( ( ( rule__Port__PortAssignment_1 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1877:1: ( ( rule__Port__PortAssignment_1 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1877:1: ( ( rule__Port__PortAssignment_1 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1878:1: ( rule__Port__PortAssignment_1 )?
            {
             before(grammarAccess.getPortAccess().getPortAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1879:1: ( rule__Port__PortAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1879:2: rule__Port__PortAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Port__PortAssignment_1_in_rule__Port__Group__1__Impl3802);
                    rule__Port__PortAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__NamedPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1893:1: rule__NamedPort__Group__0 : rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1 ;
    public final void rule__NamedPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1897:1: ( rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1898:2: rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__0__Impl_in_rule__NamedPort__Group__03837);
            rule__NamedPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedPort__Group__1_in_rule__NamedPort__Group__03840);
            rule__NamedPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__0"


    // $ANTLR start "rule__NamedPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1905:1: rule__NamedPort__Group__0__Impl : ( '.' ) ;
    public final void rule__NamedPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1909:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1910:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1910:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1911:1: '.'
            {
             before(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__NamedPort__Group__0__Impl3868); 
             after(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__0__Impl"


    // $ANTLR start "rule__NamedPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1924:1: rule__NamedPort__Group__1 : rule__NamedPort__Group__1__Impl ;
    public final void rule__NamedPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1928:1: ( rule__NamedPort__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1929:2: rule__NamedPort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__1__Impl_in_rule__NamedPort__Group__13899);
            rule__NamedPort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__1"


    // $ANTLR start "rule__NamedPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1935:1: rule__NamedPort__Group__1__Impl : ( ( rule__NamedPort__NameAssignment_1 ) ) ;
    public final void rule__NamedPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1939:1: ( ( ( rule__NamedPort__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1940:1: ( ( rule__NamedPort__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1940:1: ( ( rule__NamedPort__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1941:1: ( rule__NamedPort__NameAssignment_1 )
            {
             before(grammarAccess.getNamedPortAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1942:1: ( rule__NamedPort__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1942:2: rule__NamedPort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedPort__NameAssignment_1_in_rule__NamedPort__Group__1__Impl3926);
            rule__NamedPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__1__Impl"


    // $ANTLR start "rule__EbcOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1956:1: rule__EbcOperation__Group__0 : rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1 ;
    public final void rule__EbcOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1960:1: ( rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1961:2: rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__0__Impl_in_rule__EbcOperation__Group__03960);
            rule__EbcOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__1_in_rule__EbcOperation__Group__03963);
            rule__EbcOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__0"


    // $ANTLR start "rule__EbcOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1968:1: rule__EbcOperation__Group__0__Impl : ( 'ebc' ) ;
    public final void rule__EbcOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1972:1: ( ( 'ebc' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1973:1: ( 'ebc' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1973:1: ( 'ebc' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1974:1: 'ebc'
            {
             before(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__EbcOperation__Group__0__Impl3991); 
             after(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__0__Impl"


    // $ANTLR start "rule__EbcOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1987:1: rule__EbcOperation__Group__1 : rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2 ;
    public final void rule__EbcOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1991:1: ( rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1992:2: rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__1__Impl_in_rule__EbcOperation__Group__14022);
            rule__EbcOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__2_in_rule__EbcOperation__Group__14025);
            rule__EbcOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__1"


    // $ANTLR start "rule__EbcOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1999:1: rule__EbcOperation__Group__1__Impl : ( ( rule__EbcOperation__NameAssignment_1 ) ) ;
    public final void rule__EbcOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2003:1: ( ( ( rule__EbcOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2004:1: ( ( rule__EbcOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2004:1: ( ( rule__EbcOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2005:1: ( rule__EbcOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2006:1: ( rule__EbcOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2006:2: rule__EbcOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EbcOperation__NameAssignment_1_in_rule__EbcOperation__Group__1__Impl4052);
            rule__EbcOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__1__Impl"


    // $ANTLR start "rule__EbcOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2016:1: rule__EbcOperation__Group__2 : rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3 ;
    public final void rule__EbcOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2020:1: ( rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2021:2: rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__2__Impl_in_rule__EbcOperation__Group__24082);
            rule__EbcOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__3_in_rule__EbcOperation__Group__24085);
            rule__EbcOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__2"


    // $ANTLR start "rule__EbcOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2028:1: rule__EbcOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__EbcOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2032:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2033:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2033:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2034:1: '='
            {
             before(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__EbcOperation__Group__2__Impl4113); 
             after(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__2__Impl"


    // $ANTLR start "rule__EbcOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2047:1: rule__EbcOperation__Group__3 : rule__EbcOperation__Group__3__Impl ;
    public final void rule__EbcOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2051:1: ( rule__EbcOperation__Group__3__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2052:2: rule__EbcOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__3__Impl_in_rule__EbcOperation__Group__34144);
            rule__EbcOperation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__3"


    // $ANTLR start "rule__EbcOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2058:1: rule__EbcOperation__Group__3__Impl : ( ( rule__EbcOperation__ClassAssignment_3 ) ) ;
    public final void rule__EbcOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2062:1: ( ( ( rule__EbcOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2063:1: ( ( rule__EbcOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2063:1: ( ( rule__EbcOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2064:1: ( rule__EbcOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2065:1: ( rule__EbcOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2065:2: rule__EbcOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__EbcOperation__ClassAssignment_3_in_rule__EbcOperation__Group__3__Impl4171);
            rule__EbcOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__3__Impl"


    // $ANTLR start "rule__ClassOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2083:1: rule__ClassOperation__Group__0 : rule__ClassOperation__Group__0__Impl rule__ClassOperation__Group__1 ;
    public final void rule__ClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2087:1: ( rule__ClassOperation__Group__0__Impl rule__ClassOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2088:2: rule__ClassOperation__Group__0__Impl rule__ClassOperation__Group__1
            {
            pushFollow(FOLLOW_rule__ClassOperation__Group__0__Impl_in_rule__ClassOperation__Group__04209);
            rule__ClassOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassOperation__Group__1_in_rule__ClassOperation__Group__04212);
            rule__ClassOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__0"


    // $ANTLR start "rule__ClassOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2095:1: rule__ClassOperation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__ClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2099:1: ( ( 'operation' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2100:1: ( 'operation' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2100:1: ( 'operation' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2101:1: 'operation'
            {
             before(grammarAccess.getClassOperationAccess().getOperationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassOperation__Group__0__Impl4240); 
             after(grammarAccess.getClassOperationAccess().getOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__0__Impl"


    // $ANTLR start "rule__ClassOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2114:1: rule__ClassOperation__Group__1 : rule__ClassOperation__Group__1__Impl rule__ClassOperation__Group__2 ;
    public final void rule__ClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2118:1: ( rule__ClassOperation__Group__1__Impl rule__ClassOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2119:2: rule__ClassOperation__Group__1__Impl rule__ClassOperation__Group__2
            {
            pushFollow(FOLLOW_rule__ClassOperation__Group__1__Impl_in_rule__ClassOperation__Group__14271);
            rule__ClassOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassOperation__Group__2_in_rule__ClassOperation__Group__14274);
            rule__ClassOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__1"


    // $ANTLR start "rule__ClassOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2126:1: rule__ClassOperation__Group__1__Impl : ( ( rule__ClassOperation__NameAssignment_1 ) ) ;
    public final void rule__ClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2130:1: ( ( ( rule__ClassOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2131:1: ( ( rule__ClassOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2131:1: ( ( rule__ClassOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2132:1: ( rule__ClassOperation__NameAssignment_1 )
            {
             before(grammarAccess.getClassOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2133:1: ( rule__ClassOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2133:2: rule__ClassOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassOperation__NameAssignment_1_in_rule__ClassOperation__Group__1__Impl4301);
            rule__ClassOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__1__Impl"


    // $ANTLR start "rule__ClassOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2143:1: rule__ClassOperation__Group__2 : rule__ClassOperation__Group__2__Impl rule__ClassOperation__Group__3 ;
    public final void rule__ClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2147:1: ( rule__ClassOperation__Group__2__Impl rule__ClassOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2148:2: rule__ClassOperation__Group__2__Impl rule__ClassOperation__Group__3
            {
            pushFollow(FOLLOW_rule__ClassOperation__Group__2__Impl_in_rule__ClassOperation__Group__24331);
            rule__ClassOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassOperation__Group__3_in_rule__ClassOperation__Group__24334);
            rule__ClassOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__2"


    // $ANTLR start "rule__ClassOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2155:1: rule__ClassOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__ClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2159:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2160:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2160:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2161:1: '='
            {
             before(grammarAccess.getClassOperationAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__ClassOperation__Group__2__Impl4362); 
             after(grammarAccess.getClassOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__2__Impl"


    // $ANTLR start "rule__ClassOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2174:1: rule__ClassOperation__Group__3 : rule__ClassOperation__Group__3__Impl ;
    public final void rule__ClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2178:1: ( rule__ClassOperation__Group__3__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2179:2: rule__ClassOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ClassOperation__Group__3__Impl_in_rule__ClassOperation__Group__34393);
            rule__ClassOperation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__3"


    // $ANTLR start "rule__ClassOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2185:1: rule__ClassOperation__Group__3__Impl : ( ( rule__ClassOperation__ClassAssignment_3 ) ) ;
    public final void rule__ClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2189:1: ( ( ( rule__ClassOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2190:1: ( ( rule__ClassOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2190:1: ( ( rule__ClassOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2191:1: ( rule__ClassOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getClassOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2192:1: ( rule__ClassOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2192:2: rule__ClassOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__ClassOperation__ClassAssignment_3_in_rule__ClassOperation__Group__3__Impl4420);
            rule__ClassOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__Group__3__Impl"


    // $ANTLR start "rule__MethodOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2210:1: rule__MethodOperation__Group__0 : rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1 ;
    public final void rule__MethodOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2214:1: ( rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2215:2: rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__0__Impl_in_rule__MethodOperation__Group__04458);
            rule__MethodOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__1_in_rule__MethodOperation__Group__04461);
            rule__MethodOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__0"


    // $ANTLR start "rule__MethodOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2222:1: rule__MethodOperation__Group__0__Impl : ( 'method' ) ;
    public final void rule__MethodOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2226:1: ( ( 'method' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2227:1: ( 'method' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2227:1: ( 'method' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2228:1: 'method'
            {
             before(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__MethodOperation__Group__0__Impl4489); 
             after(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__0__Impl"


    // $ANTLR start "rule__MethodOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2241:1: rule__MethodOperation__Group__1 : rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2 ;
    public final void rule__MethodOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2245:1: ( rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2246:2: rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__1__Impl_in_rule__MethodOperation__Group__14520);
            rule__MethodOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__2_in_rule__MethodOperation__Group__14523);
            rule__MethodOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__1"


    // $ANTLR start "rule__MethodOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2253:1: rule__MethodOperation__Group__1__Impl : ( ( rule__MethodOperation__NameAssignment_1 ) ) ;
    public final void rule__MethodOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2257:1: ( ( ( rule__MethodOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2258:1: ( ( rule__MethodOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2258:1: ( ( rule__MethodOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2259:1: ( rule__MethodOperation__NameAssignment_1 )
            {
             before(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2260:1: ( rule__MethodOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2260:2: rule__MethodOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodOperation__NameAssignment_1_in_rule__MethodOperation__Group__1__Impl4550);
            rule__MethodOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__1__Impl"


    // $ANTLR start "rule__MethodOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2270:1: rule__MethodOperation__Group__2 : rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3 ;
    public final void rule__MethodOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2274:1: ( rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2275:2: rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__2__Impl_in_rule__MethodOperation__Group__24580);
            rule__MethodOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__3_in_rule__MethodOperation__Group__24583);
            rule__MethodOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__2"


    // $ANTLR start "rule__MethodOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2282:1: rule__MethodOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__MethodOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2286:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2287:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2287:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2288:1: '='
            {
             before(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__MethodOperation__Group__2__Impl4611); 
             after(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__2__Impl"


    // $ANTLR start "rule__MethodOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2301:1: rule__MethodOperation__Group__3 : rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4 ;
    public final void rule__MethodOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2305:1: ( rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2306:2: rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__3__Impl_in_rule__MethodOperation__Group__34642);
            rule__MethodOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__4_in_rule__MethodOperation__Group__34645);
            rule__MethodOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__3"


    // $ANTLR start "rule__MethodOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2313:1: rule__MethodOperation__Group__3__Impl : ( ( rule__MethodOperation__ClassAssignment_3 ) ) ;
    public final void rule__MethodOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2317:1: ( ( ( rule__MethodOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2318:1: ( ( rule__MethodOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2318:1: ( ( rule__MethodOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2319:1: ( rule__MethodOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2320:1: ( rule__MethodOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2320:2: rule__MethodOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__MethodOperation__ClassAssignment_3_in_rule__MethodOperation__Group__3__Impl4672);
            rule__MethodOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__3__Impl"


    // $ANTLR start "rule__MethodOperation__Group__4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2330:1: rule__MethodOperation__Group__4 : rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5 ;
    public final void rule__MethodOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2334:1: ( rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2335:2: rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__4__Impl_in_rule__MethodOperation__Group__44702);
            rule__MethodOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__5_in_rule__MethodOperation__Group__44705);
            rule__MethodOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__4"


    // $ANTLR start "rule__MethodOperation__Group__4__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2342:1: rule__MethodOperation__Group__4__Impl : ( '#' ) ;
    public final void rule__MethodOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2346:1: ( ( '#' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2347:1: ( '#' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2347:1: ( '#' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2348:1: '#'
            {
             before(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MethodOperation__Group__4__Impl4733); 
             after(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__4__Impl"


    // $ANTLR start "rule__MethodOperation__Group__5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2361:1: rule__MethodOperation__Group__5 : rule__MethodOperation__Group__5__Impl rule__MethodOperation__Group__6 ;
    public final void rule__MethodOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2365:1: ( rule__MethodOperation__Group__5__Impl rule__MethodOperation__Group__6 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2366:2: rule__MethodOperation__Group__5__Impl rule__MethodOperation__Group__6
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__5__Impl_in_rule__MethodOperation__Group__54764);
            rule__MethodOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__6_in_rule__MethodOperation__Group__54767);
            rule__MethodOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__5"


    // $ANTLR start "rule__MethodOperation__Group__5__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2373:1: rule__MethodOperation__Group__5__Impl : ( ( rule__MethodOperation__MethodAssignment_5 ) ) ;
    public final void rule__MethodOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2377:1: ( ( ( rule__MethodOperation__MethodAssignment_5 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2378:1: ( ( rule__MethodOperation__MethodAssignment_5 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2378:1: ( ( rule__MethodOperation__MethodAssignment_5 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2379:1: ( rule__MethodOperation__MethodAssignment_5 )
            {
             before(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2380:1: ( rule__MethodOperation__MethodAssignment_5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2380:2: rule__MethodOperation__MethodAssignment_5
            {
            pushFollow(FOLLOW_rule__MethodOperation__MethodAssignment_5_in_rule__MethodOperation__Group__5__Impl4794);
            rule__MethodOperation__MethodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__5__Impl"


    // $ANTLR start "rule__MethodOperation__Group__6"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2390:1: rule__MethodOperation__Group__6 : rule__MethodOperation__Group__6__Impl ;
    public final void rule__MethodOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2394:1: ( rule__MethodOperation__Group__6__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2395:2: rule__MethodOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__6__Impl_in_rule__MethodOperation__Group__64824);
            rule__MethodOperation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__6"


    // $ANTLR start "rule__MethodOperation__Group__6__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2401:1: rule__MethodOperation__Group__6__Impl : ( ( rule__MethodOperation__SignatureAssignment_6 ) ) ;
    public final void rule__MethodOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2405:1: ( ( ( rule__MethodOperation__SignatureAssignment_6 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2406:1: ( ( rule__MethodOperation__SignatureAssignment_6 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2406:1: ( ( rule__MethodOperation__SignatureAssignment_6 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2407:1: ( rule__MethodOperation__SignatureAssignment_6 )
            {
             before(grammarAccess.getMethodOperationAccess().getSignatureAssignment_6()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2408:1: ( rule__MethodOperation__SignatureAssignment_6 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2408:2: rule__MethodOperation__SignatureAssignment_6
            {
            pushFollow(FOLLOW_rule__MethodOperation__SignatureAssignment_6_in_rule__MethodOperation__Group__6__Impl4851);
            rule__MethodOperation__SignatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getSignatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2432:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2436:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2437:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__04895);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__04898);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2444:1: rule__Signature__Group__0__Impl : ( 'as' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2448:1: ( ( 'as' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2449:1: ( 'as' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2449:1: ( 'as' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2450:1: 'as'
            {
             before(grammarAccess.getSignatureAccess().getAsKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Signature__Group__0__Impl4926); 
             after(grammarAccess.getSignatureAccess().getAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2463:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2467:1: ( rule__Signature__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2468:2: rule__Signature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__14957);
            rule__Signature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2474:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__TypeAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2478:1: ( ( ( rule__Signature__TypeAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2479:1: ( ( rule__Signature__TypeAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2479:1: ( ( rule__Signature__TypeAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2480:1: ( rule__Signature__TypeAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2481:1: ( rule__Signature__TypeAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2481:2: rule__Signature__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Signature__TypeAssignment_1_in_rule__Signature__Group__1__Impl4984);
            rule__Signature__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__GenericType__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2495:1: rule__GenericType__Group__0 : rule__GenericType__Group__0__Impl rule__GenericType__Group__1 ;
    public final void rule__GenericType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2499:1: ( rule__GenericType__Group__0__Impl rule__GenericType__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2500:2: rule__GenericType__Group__0__Impl rule__GenericType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericType__Group__0__Impl_in_rule__GenericType__Group__05018);
            rule__GenericType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericType__Group__1_in_rule__GenericType__Group__05021);
            rule__GenericType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__0"


    // $ANTLR start "rule__GenericType__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2507:1: rule__GenericType__Group__0__Impl : ( ( rule__GenericType__OperationTypeAssignment_0 ) ) ;
    public final void rule__GenericType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2511:1: ( ( ( rule__GenericType__OperationTypeAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2512:1: ( ( rule__GenericType__OperationTypeAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2512:1: ( ( rule__GenericType__OperationTypeAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2513:1: ( rule__GenericType__OperationTypeAssignment_0 )
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2514:1: ( rule__GenericType__OperationTypeAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2514:2: rule__GenericType__OperationTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericType__OperationTypeAssignment_0_in_rule__GenericType__Group__0__Impl5048);
            rule__GenericType__OperationTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericTypeAccess().getOperationTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__0__Impl"


    // $ANTLR start "rule__GenericType__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2524:1: rule__GenericType__Group__1 : rule__GenericType__Group__1__Impl ;
    public final void rule__GenericType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2528:1: ( rule__GenericType__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2529:2: rule__GenericType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericType__Group__1__Impl_in_rule__GenericType__Group__15078);
            rule__GenericType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__1"


    // $ANTLR start "rule__GenericType__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2535:1: rule__GenericType__Group__1__Impl : ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? ) ;
    public final void rule__GenericType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2539:1: ( ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2540:1: ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2540:1: ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2541:1: ( rule__GenericType__OperationTypeParametersAssignment_1 )?
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeParametersAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2542:1: ( rule__GenericType__OperationTypeParametersAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2542:2: rule__GenericType__OperationTypeParametersAssignment_1
                    {
                    pushFollow(FOLLOW_rule__GenericType__OperationTypeParametersAssignment_1_in_rule__GenericType__Group__1__Impl5105);
                    rule__GenericType__OperationTypeParametersAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGenericTypeAccess().getOperationTypeParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__1__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2556:1: rule__OperationTypeParameters__Group__0 : rule__OperationTypeParameters__Group__0__Impl rule__OperationTypeParameters__Group__1 ;
    public final void rule__OperationTypeParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2560:1: ( rule__OperationTypeParameters__Group__0__Impl rule__OperationTypeParameters__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2561:2: rule__OperationTypeParameters__Group__0__Impl rule__OperationTypeParameters__Group__1
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__0__Impl_in_rule__OperationTypeParameters__Group__05140);
            rule__OperationTypeParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__1_in_rule__OperationTypeParameters__Group__05143);
            rule__OperationTypeParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__0"


    // $ANTLR start "rule__OperationTypeParameters__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2568:1: rule__OperationTypeParameters__Group__0__Impl : ( '<' ) ;
    public final void rule__OperationTypeParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2572:1: ( ( '<' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2573:1: ( '<' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2573:1: ( '<' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2574:1: '<'
            {
             before(grammarAccess.getOperationTypeParametersAccess().getLessThanSignKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__OperationTypeParameters__Group__0__Impl5171); 
             after(grammarAccess.getOperationTypeParametersAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__0__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2587:1: rule__OperationTypeParameters__Group__1 : rule__OperationTypeParameters__Group__1__Impl rule__OperationTypeParameters__Group__2 ;
    public final void rule__OperationTypeParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2591:1: ( rule__OperationTypeParameters__Group__1__Impl rule__OperationTypeParameters__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2592:2: rule__OperationTypeParameters__Group__1__Impl rule__OperationTypeParameters__Group__2
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__1__Impl_in_rule__OperationTypeParameters__Group__15202);
            rule__OperationTypeParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__2_in_rule__OperationTypeParameters__Group__15205);
            rule__OperationTypeParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__1"


    // $ANTLR start "rule__OperationTypeParameters__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2599:1: rule__OperationTypeParameters__Group__1__Impl : ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) ) ;
    public final void rule__OperationTypeParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2603:1: ( ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2604:1: ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2604:1: ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2605:1: ( rule__OperationTypeParameters__TypeParameterAssignment_1 )
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParameterAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2606:1: ( rule__OperationTypeParameters__TypeParameterAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2606:2: rule__OperationTypeParameters__TypeParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__TypeParameterAssignment_1_in_rule__OperationTypeParameters__Group__1__Impl5232);
            rule__OperationTypeParameters__TypeParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__1__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2616:1: rule__OperationTypeParameters__Group__2 : rule__OperationTypeParameters__Group__2__Impl rule__OperationTypeParameters__Group__3 ;
    public final void rule__OperationTypeParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2620:1: ( rule__OperationTypeParameters__Group__2__Impl rule__OperationTypeParameters__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2621:2: rule__OperationTypeParameters__Group__2__Impl rule__OperationTypeParameters__Group__3
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__2__Impl_in_rule__OperationTypeParameters__Group__25262);
            rule__OperationTypeParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__3_in_rule__OperationTypeParameters__Group__25265);
            rule__OperationTypeParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__2"


    // $ANTLR start "rule__OperationTypeParameters__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2628:1: rule__OperationTypeParameters__Group__2__Impl : ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* ) ;
    public final void rule__OperationTypeParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2632:1: ( ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2633:1: ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2633:1: ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2634:1: ( rule__OperationTypeParameters__TypeParametersAssignment_2 )*
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParametersAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2635:1: ( rule__OperationTypeParameters__TypeParametersAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2635:2: rule__OperationTypeParameters__TypeParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__OperationTypeParameters__TypeParametersAssignment_2_in_rule__OperationTypeParameters__Group__2__Impl5292);
            	    rule__OperationTypeParameters__TypeParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__2__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2645:1: rule__OperationTypeParameters__Group__3 : rule__OperationTypeParameters__Group__3__Impl ;
    public final void rule__OperationTypeParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2649:1: ( rule__OperationTypeParameters__Group__3__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2650:2: rule__OperationTypeParameters__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__3__Impl_in_rule__OperationTypeParameters__Group__35323);
            rule__OperationTypeParameters__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__3"


    // $ANTLR start "rule__OperationTypeParameters__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2656:1: rule__OperationTypeParameters__Group__3__Impl : ( '>' ) ;
    public final void rule__OperationTypeParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2660:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2661:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2661:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2662:1: '>'
            {
             before(grammarAccess.getOperationTypeParametersAccess().getGreaterThanSignKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__OperationTypeParameters__Group__3__Impl5351); 
             after(grammarAccess.getOperationTypeParametersAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__3__Impl"


    // $ANTLR start "rule__CSTypeParameter__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2683:1: rule__CSTypeParameter__Group__0 : rule__CSTypeParameter__Group__0__Impl rule__CSTypeParameter__Group__1 ;
    public final void rule__CSTypeParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2687:1: ( rule__CSTypeParameter__Group__0__Impl rule__CSTypeParameter__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2688:2: rule__CSTypeParameter__Group__0__Impl rule__CSTypeParameter__Group__1
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__Group__0__Impl_in_rule__CSTypeParameter__Group__05390);
            rule__CSTypeParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CSTypeParameter__Group__1_in_rule__CSTypeParameter__Group__05393);
            rule__CSTypeParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__0"


    // $ANTLR start "rule__CSTypeParameter__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2695:1: rule__CSTypeParameter__Group__0__Impl : ( ',' ) ;
    public final void rule__CSTypeParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2699:1: ( ( ',' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2700:1: ( ',' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2700:1: ( ',' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2701:1: ','
            {
             before(grammarAccess.getCSTypeParameterAccess().getCommaKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__CSTypeParameter__Group__0__Impl5421); 
             after(grammarAccess.getCSTypeParameterAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__0__Impl"


    // $ANTLR start "rule__CSTypeParameter__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2714:1: rule__CSTypeParameter__Group__1 : rule__CSTypeParameter__Group__1__Impl ;
    public final void rule__CSTypeParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2718:1: ( rule__CSTypeParameter__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2719:2: rule__CSTypeParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__Group__1__Impl_in_rule__CSTypeParameter__Group__15452);
            rule__CSTypeParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__1"


    // $ANTLR start "rule__CSTypeParameter__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2725:1: rule__CSTypeParameter__Group__1__Impl : ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) ) ;
    public final void rule__CSTypeParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2729:1: ( ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2730:1: ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2730:1: ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2731:1: ( rule__CSTypeParameter__TypeParameterAssignment_1 )
            {
             before(grammarAccess.getCSTypeParameterAccess().getTypeParameterAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2732:1: ( rule__CSTypeParameter__TypeParameterAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2732:2: rule__CSTypeParameter__TypeParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__TypeParameterAssignment_1_in_rule__CSTypeParameter__Group__1__Impl5479);
            rule__CSTypeParameter__TypeParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSTypeParameterAccess().getTypeParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_0_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2747:1: rule__Model__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2751:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2752:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2752:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2753:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_15518);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_0_1"


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2762:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2766:1: ( ( ruleImport ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2767:1: ( ruleImport )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2767:1: ( ruleImport )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2768:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_15549);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__FunctionUnitsAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2777:1: rule__Model__FunctionUnitsAssignment_2 : ( ruleFunctionUnit ) ;
    public final void rule__Model__FunctionUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2781:1: ( ( ruleFunctionUnit ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2782:1: ( ruleFunctionUnit )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2782:1: ( ruleFunctionUnit )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2783:1: ruleFunctionUnit
            {
             before(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_rule__Model__FunctionUnitsAssignment_25580);
            ruleFunctionUnit();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FunctionUnitsAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2792:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2796:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2797:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2797:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2798:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_15611);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Flow__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2807:1: rule__Flow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2811:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2812:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2812:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2813:1: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_15642); 
             after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__NameAssignment_1"


    // $ANTLR start "rule__Flow__StreamsAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2822:1: rule__Flow__StreamsAssignment_2 : ( ruleStream ) ;
    public final void rule__Flow__StreamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2826:1: ( ( ruleStream ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2827:1: ( ruleStream )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2827:1: ( ruleStream )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2828:1: ruleStream
            {
             before(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStream_in_rule__Flow__StreamsAssignment_25673);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__StreamsAssignment_2"


    // $ANTLR start "rule__Stream__LeftPortAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2837:1: rule__Stream__LeftPortAssignment_0 : ( ruleLeftPort ) ;
    public final void rule__Stream__LeftPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2841:1: ( ( ruleLeftPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2842:1: ( ruleLeftPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2842:1: ( ruleLeftPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2843:1: ruleLeftPort
            {
             before(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeftPort_in_rule__Stream__LeftPortAssignment_05704);
            ruleLeftPort();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__LeftPortAssignment_0"


    // $ANTLR start "rule__Stream__MessageAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2852:1: rule__Stream__MessageAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Stream__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2856:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2857:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2857:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2858:1: ruleQualifiedName
            {
             before(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Stream__MessageAssignment_25735);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__MessageAssignment_2"


    // $ANTLR start "rule__Stream__RightPortAssignment_4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2867:1: rule__Stream__RightPortAssignment_4 : ( ruleRightPort ) ;
    public final void rule__Stream__RightPortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2871:1: ( ( ruleRightPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2872:1: ( ruleRightPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2872:1: ( ruleRightPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2873:1: ruleRightPort
            {
             before(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRightPort_in_rule__Stream__RightPortAssignment_45766);
            ruleRightPort();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__RightPortAssignment_4"


    // $ANTLR start "rule__Port__FunctionUnitAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2882:1: rule__Port__FunctionUnitAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Port__FunctionUnitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2886:1: ( ( ( RULE_ID ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2887:1: ( ( RULE_ID ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2887:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2888:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2889:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2890:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__FunctionUnitAssignment_05801); 
             after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__FunctionUnitAssignment_0"


    // $ANTLR start "rule__Port__PortAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2901:1: rule__Port__PortAssignment_1 : ( ruleNamedPort ) ;
    public final void rule__Port__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2905:1: ( ( ruleNamedPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2906:1: ( ruleNamedPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2906:1: ( ruleNamedPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2907:1: ruleNamedPort
            {
             before(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNamedPort_in_rule__Port__PortAssignment_15836);
            ruleNamedPort();

            state._fsp--;

             after(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__PortAssignment_1"


    // $ANTLR start "rule__NamedPort__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2916:1: rule__NamedPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2920:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2921:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2921:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2922:1: RULE_ID
            {
             before(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedPort__NameAssignment_15867); 
             after(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__NameAssignment_1"


    // $ANTLR start "rule__EbcOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2931:1: rule__EbcOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EbcOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2935:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2936:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2936:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2937:1: RULE_ID
            {
             before(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EbcOperation__NameAssignment_15898); 
             after(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__NameAssignment_1"


    // $ANTLR start "rule__EbcOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2946:1: rule__EbcOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__EbcOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2950:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2951:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2951:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2952:1: ruleNativeClass
            {
             before(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__EbcOperation__ClassAssignment_35929);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__ClassAssignment_3"


    // $ANTLR start "rule__NativeClass__ReferenceAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2961:1: rule__NativeClass__ReferenceAssignment : ( ruleQualifiedName ) ;
    public final void rule__NativeClass__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2965:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2966:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2966:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2967:1: ruleQualifiedName
            {
             before(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NativeClass__ReferenceAssignment5960);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeClass__ReferenceAssignment"


    // $ANTLR start "rule__ClassOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2976:1: rule__ClassOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2980:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2981:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2981:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2982:1: RULE_ID
            {
             before(grammarAccess.getClassOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassOperation__NameAssignment_15991); 
             after(grammarAccess.getClassOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__NameAssignment_1"


    // $ANTLR start "rule__ClassOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2991:1: rule__ClassOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__ClassOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2995:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2996:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2996:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2997:1: ruleNativeClass
            {
             before(grammarAccess.getClassOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__ClassOperation__ClassAssignment_36022);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getClassOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOperation__ClassAssignment_3"


    // $ANTLR start "rule__MethodOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3006:1: rule__MethodOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3010:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3011:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3011:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3012:1: RULE_ID
            {
             before(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodOperation__NameAssignment_16053); 
             after(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__NameAssignment_1"


    // $ANTLR start "rule__MethodOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3021:1: rule__MethodOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__MethodOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3025:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3026:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3026:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3027:1: ruleNativeClass
            {
             before(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__MethodOperation__ClassAssignment_36084);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__ClassAssignment_3"


    // $ANTLR start "rule__MethodOperation__MethodAssignment_5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3036:1: rule__MethodOperation__MethodAssignment_5 : ( ruleNativeMethod ) ;
    public final void rule__MethodOperation__MethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3040:1: ( ( ruleNativeMethod ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3041:1: ( ruleNativeMethod )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3041:1: ( ruleNativeMethod )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3042:1: ruleNativeMethod
            {
             before(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_rule__MethodOperation__MethodAssignment_56115);
            ruleNativeMethod();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__MethodAssignment_5"


    // $ANTLR start "rule__MethodOperation__SignatureAssignment_6"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3051:1: rule__MethodOperation__SignatureAssignment_6 : ( ruleSignature ) ;
    public final void rule__MethodOperation__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3055:1: ( ( ruleSignature ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3056:1: ( ruleSignature )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3056:1: ( ruleSignature )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3057:1: ruleSignature
            {
             before(grammarAccess.getMethodOperationAccess().getSignatureSignatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSignature_in_rule__MethodOperation__SignatureAssignment_66146);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getSignatureSignatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__SignatureAssignment_6"


    // $ANTLR start "rule__Signature__TypeAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3066:1: rule__Signature__TypeAssignment_1 : ( ruleGenericType ) ;
    public final void rule__Signature__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3070:1: ( ( ruleGenericType ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3071:1: ( ruleGenericType )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3071:1: ( ruleGenericType )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3072:1: ruleGenericType
            {
             before(grammarAccess.getSignatureAccess().getTypeGenericTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGenericType_in_rule__Signature__TypeAssignment_16177);
            ruleGenericType();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getTypeGenericTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__TypeAssignment_1"


    // $ANTLR start "rule__GenericType__OperationTypeAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3081:1: rule__GenericType__OperationTypeAssignment_0 : ( ruleOperationType ) ;
    public final void rule__GenericType__OperationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3085:1: ( ( ruleOperationType ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3086:1: ( ruleOperationType )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3086:1: ( ruleOperationType )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3087:1: ruleOperationType
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeOperationTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOperationType_in_rule__GenericType__OperationTypeAssignment_06208);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getGenericTypeAccess().getOperationTypeOperationTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__OperationTypeAssignment_0"


    // $ANTLR start "rule__GenericType__OperationTypeParametersAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3096:1: rule__GenericType__OperationTypeParametersAssignment_1 : ( ruleOperationTypeParameters ) ;
    public final void rule__GenericType__OperationTypeParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3100:1: ( ( ruleOperationTypeParameters ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3101:1: ( ruleOperationTypeParameters )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3101:1: ( ruleOperationTypeParameters )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3102:1: ruleOperationTypeParameters
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeParametersOperationTypeParametersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperationTypeParameters_in_rule__GenericType__OperationTypeParametersAssignment_16239);
            ruleOperationTypeParameters();

            state._fsp--;

             after(grammarAccess.getGenericTypeAccess().getOperationTypeParametersOperationTypeParametersParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__OperationTypeParametersAssignment_1"


    // $ANTLR start "rule__OperationType__NameAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3111:1: rule__OperationType__NameAssignment : ( ( rule__OperationType__NameAlternatives_0 ) ) ;
    public final void rule__OperationType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3115:1: ( ( ( rule__OperationType__NameAlternatives_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3116:1: ( ( rule__OperationType__NameAlternatives_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3116:1: ( ( rule__OperationType__NameAlternatives_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3117:1: ( rule__OperationType__NameAlternatives_0 )
            {
             before(grammarAccess.getOperationTypeAccess().getNameAlternatives_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3118:1: ( rule__OperationType__NameAlternatives_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3118:2: rule__OperationType__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__OperationType__NameAlternatives_0_in_rule__OperationType__NameAssignment6270);
            rule__OperationType__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__NameAssignment"


    // $ANTLR start "rule__OperationTypeParameters__TypeParameterAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3127:1: rule__OperationTypeParameters__TypeParameterAssignment_1 : ( ruleTypeParameter ) ;
    public final void rule__OperationTypeParameters__TypeParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3131:1: ( ( ruleTypeParameter ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3132:1: ( ruleTypeParameter )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3132:1: ( ruleTypeParameter )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3133:1: ruleTypeParameter
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_rule__OperationTypeParameters__TypeParameterAssignment_16303);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__TypeParameterAssignment_1"


    // $ANTLR start "rule__OperationTypeParameters__TypeParametersAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3142:1: rule__OperationTypeParameters__TypeParametersAssignment_2 : ( ruleCSTypeParameter ) ;
    public final void rule__OperationTypeParameters__TypeParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3146:1: ( ( ruleCSTypeParameter ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3147:1: ( ruleCSTypeParameter )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3147:1: ( ruleCSTypeParameter )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3148:1: ruleCSTypeParameter
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParametersCSTypeParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCSTypeParameter_in_rule__OperationTypeParameters__TypeParametersAssignment_26334);
            ruleCSTypeParameter();

            state._fsp--;

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParametersCSTypeParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__TypeParametersAssignment_2"


    // $ANTLR start "rule__CSTypeParameter__TypeParameterAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3157:1: rule__CSTypeParameter__TypeParameterAssignment_1 : ( ruleTypeParameter ) ;
    public final void rule__CSTypeParameter__TypeParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3161:1: ( ( ruleTypeParameter ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3162:1: ( ruleTypeParameter )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3162:1: ( ruleTypeParameter )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3163:1: ruleTypeParameter
            {
             before(grammarAccess.getCSTypeParameterAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_rule__CSTypeParameter__TypeParameterAssignment_16365);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getCSTypeParameterAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__TypeParameterAssignment_1"


    // $ANTLR start "rule__Type__ReferenceAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3172:1: rule__Type__ReferenceAssignment : ( ruleQualifiedName ) ;
    public final void rule__Type__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3176:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3177:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3177:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3178:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Type__ReferenceAssignment6396);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getReferenceQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ReferenceAssignment"


    // $ANTLR start "rule__NativeMethod__NameAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3187:1: rule__NativeMethod__NameAssignment : ( RULE_ID ) ;
    public final void rule__NativeMethod__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3191:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3192:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3192:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3193:1: RULE_ID
            {
             before(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NativeMethod__NameAssignment6427); 
             after(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeMethod__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUnit188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUnit__Alternatives_in_ruleFunctionUnit214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__0_in_ruleStream394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_entryRuleLeftPort421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPort428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LeftPort__Alternatives_in_ruleLeftPort454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInputPort488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__0_in_ruleGlobalInputPort514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__0_in_ruleUnnamedSubFlowPort574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_entryRuleRightPort601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPort608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPort__Alternatives_in_ruleRightPort634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalOutputPort668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__0_in_ruleGlobalOutputPort694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_entryRuleNamedPort781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPort788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__0_in_ruleNamedPort814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEbcOperation908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__0_in_ruleEbcOperation934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_entryRuleNativeClass961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeClass968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeClass__ReferenceAssignment_in_ruleNativeClass994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOperation_in_entryRuleClassOperation1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOperation1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__0_in_ruleClassOperation1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodOperation1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__0_in_ruleMethodOperation1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignature1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__Group__0_in_ruleSignature1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_entryRuleGenericType1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__Group__0_in_ruleGenericType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationType_in_entryRuleOperationType1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationType1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationType__NameAssignment_in_ruleOperationType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationTypeParameters_in_entryRuleOperationTypeParameters1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationTypeParameters1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__0_in_ruleOperationTypeParameters1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSTypeParameter_in_entryRuleCSTypeParameter1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSTypeParameter1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__0_in_ruleCSTypeParameter1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ReferenceAssignment_in_ruleType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeMethod1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeMethod__NameAssignment_in_ruleNativeMethod1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__FunctionUnit__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__FunctionUnit__Alternatives1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_rule__LeftPort__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_rule__LeftPort__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__LeftPort__Alternatives1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_rule__RightPort__Alternatives1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_rule__RightPort__Alternatives1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__RightPort__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_rule__Operation__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_rule__Operation__Alternatives1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOperation_in_rule__Operation__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OperationType__NameAlternatives_01878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OperationType__NameAlternatives_01898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_rule__TypeParameter__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeParameter__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01979 = new BitSet(new long[]{0x0000000001A18000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12040 = new BitSet(new long[]{0x0000000001A18000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl2070 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionUnitsAssignment_2_in_rule__Model__Group__2__Impl2128 = new BitSet(new long[]{0x0000000001A10002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__02165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__02168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_0__0__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02288 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2374 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Flow__Group__0__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12716 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StreamsAssignment_2_in_rule__Flow__Group__2__Impl2803 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rule__Stream__Group__0__Impl_in_rule__Stream__Group__02840 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Stream__Group__1_in_rule__Stream__Group__02843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__LeftPortAssignment_0_in_rule__Stream__Group__0__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__1__Impl_in_rule__Stream__Group__12900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stream__Group__2_in_rule__Stream__Group__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Stream__Group__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__2__Impl_in_rule__Stream__Group__22962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Stream__Group__3_in_rule__Stream__Group__22965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__MessageAssignment_2_in_rule__Stream__Group__2__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__3__Impl_in_rule__Stream__Group__33022 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Stream__Group__4_in_rule__Stream__Group__33025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Stream__Group__3__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__4__Impl_in_rule__Stream__Group__43084 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Stream__Group__5_in_rule__Stream__Group__43087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__RightPortAssignment_4_in_rule__Stream__Group__4__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__5__Impl_in_rule__Stream__Group__53144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Stream__Group__5__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__0__Impl_in_rule__GlobalInputPort__Group__03215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__1_in_rule__GlobalInputPort__Group__03218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GlobalInputPort__Group__0__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__1__Impl_in_rule__GlobalInputPort__Group__13277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__2_in_rule__GlobalInputPort__Group__13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GlobalInputPort__Group__1__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__2__Impl_in_rule__GlobalInputPort__Group__23339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__0__Impl_in_rule__UnnamedSubFlowPort__Group__03403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__1_in_rule__UnnamedSubFlowPort__Group__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnnamedSubFlowPort__Group__0__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__1__Impl_in_rule__UnnamedSubFlowPort__Group__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__0__Impl_in_rule__GlobalOutputPort__Group__03527 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__1_in_rule__GlobalOutputPort__Group__03530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GlobalOutputPort__Group__0__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__1__Impl_in_rule__GlobalOutputPort__Group__13589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__2_in_rule__GlobalOutputPort__Group__13592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GlobalOutputPort__Group__1__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__2__Impl_in_rule__GlobalOutputPort__Group__23651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__FunctionUnitAssignment_0_in_rule__Port__Group__0__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__PortAssignment_1_in_rule__Port__Group__1__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__0__Impl_in_rule__NamedPort__Group__03837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__1_in_rule__NamedPort__Group__03840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamedPort__Group__0__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__1__Impl_in_rule__NamedPort__Group__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__NameAssignment_1_in_rule__NamedPort__Group__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__0__Impl_in_rule__EbcOperation__Group__03960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__1_in_rule__EbcOperation__Group__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EbcOperation__Group__0__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__1__Impl_in_rule__EbcOperation__Group__14022 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__2_in_rule__EbcOperation__Group__14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__NameAssignment_1_in_rule__EbcOperation__Group__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__2__Impl_in_rule__EbcOperation__Group__24082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__3_in_rule__EbcOperation__Group__24085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EbcOperation__Group__2__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__3__Impl_in_rule__EbcOperation__Group__34144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__ClassAssignment_3_in_rule__EbcOperation__Group__3__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__0__Impl_in_rule__ClassOperation__Group__04209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__1_in_rule__ClassOperation__Group__04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassOperation__Group__0__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__1__Impl_in_rule__ClassOperation__Group__14271 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__2_in_rule__ClassOperation__Group__14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__NameAssignment_1_in_rule__ClassOperation__Group__1__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__2__Impl_in_rule__ClassOperation__Group__24331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__3_in_rule__ClassOperation__Group__24334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassOperation__Group__2__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__Group__3__Impl_in_rule__ClassOperation__Group__34393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOperation__ClassAssignment_3_in_rule__ClassOperation__Group__3__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__0__Impl_in_rule__MethodOperation__Group__04458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__1_in_rule__MethodOperation__Group__04461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MethodOperation__Group__0__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__1__Impl_in_rule__MethodOperation__Group__14520 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__2_in_rule__MethodOperation__Group__14523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__NameAssignment_1_in_rule__MethodOperation__Group__1__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__2__Impl_in_rule__MethodOperation__Group__24580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__3_in_rule__MethodOperation__Group__24583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MethodOperation__Group__2__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__3__Impl_in_rule__MethodOperation__Group__34642 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__4_in_rule__MethodOperation__Group__34645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__ClassAssignment_3_in_rule__MethodOperation__Group__3__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__4__Impl_in_rule__MethodOperation__Group__44702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__5_in_rule__MethodOperation__Group__44705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MethodOperation__Group__4__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__5__Impl_in_rule__MethodOperation__Group__54764 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__6_in_rule__MethodOperation__Group__54767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__MethodAssignment_5_in_rule__MethodOperation__Group__5__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__6__Impl_in_rule__MethodOperation__Group__64824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__SignatureAssignment_6_in_rule__MethodOperation__Group__6__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__04895 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__04898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Signature__Group__0__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__14957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__TypeAssignment_1_in_rule__Signature__Group__1__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__Group__0__Impl_in_rule__GenericType__Group__05018 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__GenericType__Group__1_in_rule__GenericType__Group__05021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__OperationTypeAssignment_0_in_rule__GenericType__Group__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__Group__1__Impl_in_rule__GenericType__Group__15078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__OperationTypeParametersAssignment_1_in_rule__GenericType__Group__1__Impl5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__0__Impl_in_rule__OperationTypeParameters__Group__05140 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__1_in_rule__OperationTypeParameters__Group__05143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OperationTypeParameters__Group__0__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__1__Impl_in_rule__OperationTypeParameters__Group__15202 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__2_in_rule__OperationTypeParameters__Group__15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__TypeParameterAssignment_1_in_rule__OperationTypeParameters__Group__1__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__2__Impl_in_rule__OperationTypeParameters__Group__25262 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__3_in_rule__OperationTypeParameters__Group__25265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__TypeParametersAssignment_2_in_rule__OperationTypeParameters__Group__2__Impl5292 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__3__Impl_in_rule__OperationTypeParameters__Group__35323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OperationTypeParameters__Group__3__Impl5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__0__Impl_in_rule__CSTypeParameter__Group__05390 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__1_in_rule__CSTypeParameter__Group__05393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CSTypeParameter__Group__0__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__1__Impl_in_rule__CSTypeParameter__Group__15452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__TypeParameterAssignment_1_in_rule__CSTypeParameter__Group__1__Impl5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_15518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_rule__Model__FunctionUnitsAssignment_25580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_15611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_15642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_rule__Flow__StreamsAssignment_25673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_rule__Stream__LeftPortAssignment_05704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Stream__MessageAssignment_25735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_rule__Stream__RightPortAssignment_45766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__FunctionUnitAssignment_05801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_rule__Port__PortAssignment_15836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedPort__NameAssignment_15867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EbcOperation__NameAssignment_15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__EbcOperation__ClassAssignment_35929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NativeClass__ReferenceAssignment5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassOperation__NameAssignment_15991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__ClassOperation__ClassAssignment_36022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodOperation__NameAssignment_16053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__MethodOperation__ClassAssignment_36084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_rule__MethodOperation__MethodAssignment_56115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_rule__MethodOperation__SignatureAssignment_66146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_rule__Signature__TypeAssignment_16177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationType_in_rule__GenericType__OperationTypeAssignment_06208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationTypeParameters_in_rule__GenericType__OperationTypeParametersAssignment_16239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationType__NameAlternatives_0_in_rule__OperationType__NameAssignment6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__OperationTypeParameters__TypeParameterAssignment_16303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSTypeParameter_in_rule__OperationTypeParameters__TypeParametersAssignment_26334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__CSTypeParameter__TypeParameterAssignment_16365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Type__ReferenceAssignment6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NativeMethod__NameAssignment6427 = new BitSet(new long[]{0x0000000000000002L});

}